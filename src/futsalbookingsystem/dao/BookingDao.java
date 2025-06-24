package futsalbookingsystem.dao;

import futsalbookingsystem.database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingDao {
    private final MySqlConnection dbConnector = new MySqlConnection();

    public void saveBookingStatus(String userEmail, String slotId, String status) {
        String sql = "INSERT INTO bookings (user_email, slot_id, status) VALUES (?, ?, ?) "
                   + "ON DUPLICATE KEY UPDATE status = ?";
        
        Connection conn = null;
        try {
            conn = dbConnector.openConnection();
            if (conn == null || conn.isClosed()) {
                System.err.println("Failed to obtain database connection");
                return;
            }
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, userEmail);
                stmt.setString(2, slotId);
                stmt.setString(3, status);
                stmt.setString(4, status);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("Database error in saveBookingStatus:");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                dbConnector.closeConnection(conn);
            }
        }
    }

    public String getBookingStatus(String userEmail, String slotId) {
        String sql = "SELECT status FROM bookings WHERE user_email = ? AND slot_id = ?";
        Connection conn = null;
        
        try {
            conn = dbConnector.openConnection();
            if (conn == null || conn.isClosed()) {
                System.err.println("Failed to obtain database connection");
                return null;
            }
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, userEmail);
                stmt.setString(2, slotId);
                
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next() ? rs.getString("status") : null;
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error in getBookingStatus:");
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null) {
                dbConnector.closeConnection(conn);
            }
        }
    }
}
