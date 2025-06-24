package futsalbookingsystem.dao;

import futsalbookingsystem.database.MySqlConnection;
import futsalbookingsystem.model.TeamData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeamDao {
    private final MySqlConnection mysql = new MySqlConnection();

    public boolean registerTeam(String teamName, int memberCount, String logoPath, 
                               String paymentStatus, String userEmail) {
        Connection conn = mysql.openConnection();
        String query = "INSERT INTO teams (team_name, member_count, logo_path, payment_status, user_email) "
                     + "VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, teamName);
            stmt.setInt(2, memberCount);
            stmt.setString(3, logoPath);
            stmt.setString(4, paymentStatus);
            stmt.setString(5, userEmail);
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            mysql.closeConnection(conn);
        }
    }
    
       public List<TeamData> getTeamsByUser(String userEmail) {
            List<TeamData> teams = new ArrayList<>();
            String query = "SELECT * FROM teams WHERE user_email = ?";
            try (Connection conn = mysql.openConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, userEmail);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    teams.add(new TeamData(
                        rs.getInt("team_id"),               
                        rs.getString("team_name"),
                        rs.getInt("member_count"),
                        rs.getString("logo_path"),
                        rs.getString("payment_status"),
                        rs.getString("user_email")
                    ));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return teams;
        }


    
}
