/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public interface DbConnection {
    Connection openConnection();
    void closeConnection(Connection conn);

}
//public class MySqlConnection implements DbConnection {
//    private static final String URL = "jdbc:mysql://localhost:3306/futsal"; // Replace with your DB
//    private static final String USER = "root";
//    private static final String PASSWORD = "your_password"; // Replace with your DB password
//
//    @Override
//    public Connection openConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    @Override
//    public void closeConnection(Connection conn) {
//        try {
//            if (conn != null && !conn.isClosed()) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
