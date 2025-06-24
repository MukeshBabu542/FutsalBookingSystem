package futsalbookingsystem.dao;

import futsalbookingsystem.database.MySqlConnection;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class EventDao {
    MySqlConnection mysql = new MySqlConnection();

    public boolean saveEvent(Map<String, String> data) {
        String checkQuery = "SELECT id FROM events LIMIT 1";
        String insertQuery = "INSERT INTO events(name, datetime, registration_deadline, game_duration, dress_code, registration_fee, payment_options) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String updateQuery = "UPDATE events SET name=?, datetime=?, registration_deadline=?, game_duration=?, dress_code=?, registration_fee=?, payment_options=? WHERE id=?";

        try (Connection conn = mysql.openConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(checkQuery);

            if (rs.next()) {
                int id = rs.getInt("id");
                PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                updateStmt.setString(1, data.get("name"));
                updateStmt.setString(2, data.get("datetime"));
                updateStmt.setString(3, data.get("registration_deadline"));
                updateStmt.setString(4, data.get("game_duration"));
                updateStmt.setString(5, data.get("dress_code"));
                updateStmt.setString(6, data.get("registration_fee"));
                updateStmt.setString(7, data.get("payment_options"));
                updateStmt.setInt(8, id);
                return updateStmt.executeUpdate() > 0;
            } else {
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                insertStmt.setString(1, data.get("name"));
                insertStmt.setString(2, data.get("datetime"));
                insertStmt.setString(3, data.get("registration_deadline"));
                insertStmt.setString(4, data.get("game_duration"));
                insertStmt.setString(5, data.get("dress_code"));
                insertStmt.setString(6, data.get("registration_fee"));
                insertStmt.setString(7, data.get("payment_options"));
                return insertStmt.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Map<String, String> loadEvent() {
    String query = "SELECT * FROM events LIMIT 1";
    Map<String, String> data = new HashMap<>();

    try (Connection conn = mysql.openConnection();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            data.put("name", rs.getString("name"));
            data.put("datetime", rs.getString("datetime"));
            data.put("registration_deadline", rs.getString("registration_deadline"));
            data.put("game_duration", rs.getString("game_duration"));
            data.put("dress_code", rs.getString("dress_code"));
            data.put("registration_fee", rs.getString("registration_fee"));
            data.put("payment_options", rs.getString("payment_options"));
            data.put("image_path", rs.getString("image_path")); // Add this line
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return data;
}


    public boolean updateEventImagePath(String imagePath) {
        String selectQuery = "SELECT id FROM events LIMIT 1";
        String updateQuery = "UPDATE events SET image_path = ? WHERE id = ?";

        try (Connection conn = mysql.openConnection();
            PreparedStatement selectStmt = conn.prepareStatement(selectQuery);
            ResultSet rs = selectStmt.executeQuery()) {

            if (rs.next()) {
                int id = rs.getInt("id");

                try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                    updateStmt.setString(1, imagePath);
                    updateStmt.setInt(2, id);
                    return updateStmt.executeUpdate() > 0;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public String getEventImagePath() {
        String query = "SELECT image_path FROM events LIMIT 1";
        
        try (Connection conn = mysql.openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                return rs.getString("image_path");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    
    
}
