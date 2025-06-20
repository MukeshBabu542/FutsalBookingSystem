
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.dao;

import futsalbookingsystem.database.MySqlConnection;
import futsalbookingsystem.model.LoginRequest;
import futsalbookingsystem.model.UserData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class UserDao {
    MySqlConnection mysql = new MySqlConnection();
    public boolean registration(UserData user){
      Connection conn = (Connection) mysql.openConnection();
//      if(conn== null)return false;
         String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "               
            + "fname VARCHAR(50) NOT NULL, "
            + "email VARCHAR(100) UNIQUE NOT NULL, "
            + "phonenumber VARCHAR(255) NOT NULL, "
            + "fpassword VARCHAR(255) NOT NULL"
            + ")";
           try {
            PreparedStatement createtbl= conn.prepareStatement(createTableSQL);
            createtbl.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UserDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      String query= "INSERT INTO users(fname,email,phonenumber,fpassword)VALUES(?,?,?,?)";
      try{
          PreparedStatement stmnt = conn.prepareStatement(query);
          stmnt.setString(1,user.getName());
          stmnt.setString(2,user.getEmail());
          stmnt.setString(3,user.getPhonenumber());
          stmnt.setString(4,user.getPassword());
          
          int result = stmnt.executeUpdate();
          return result>0;
      } catch(SQLException e){
         return false; 
          
      } finally{
          mysql.closeConnection((java.sql.Connection) conn);
          
      }
    }
    
    public UserData login(LoginRequest loginData){
      String query= "SELECT * FROM users WHERE email=? and fpassword=?";
      Connection conn= mysql.openConnection();
      try{
          PreparedStatement stmnt= conn.prepareStatement(query);
          stmnt.setString(1,loginData.getEmail());
          stmnt.setString(2,loginData.getPassword());
          ResultSet result= stmnt.executeQuery();
          if (result.next()){
              String fname = result.getString("fname");
              String id = result.getString("id");
              String email= result.getString("email");
              String fpassword = result.getString("fpassword");
              String phonenumber = result.getString("phonenumber");
              UserData user = new UserData(id,fname,email,phonenumber,fpassword);
              return user;
          }else{
              return null;
          }
    } catch(SQLException e){
        return null;
    } finally{
          mysql.closeConnection(conn);
      }
    }
    
    public boolean checkEmail(String email){
        String query="SELECT * FROM users where email=?";
        Connection conn = mysql.openConnection();
        try{
            PreparedStatement stmnt = conn.prepareStatement(query);
            stmnt.setString(1, email);
            ResultSet result = stmnt.executeQuery();
            if(result.next()){
                return true;
            } else{ 
                return false;
            }
        } catch(Exception e){
            return false;
        }finally{
            mysql.closeConnection(conn);
        }
    }
    public boolean changePassword(String oldPassword, String newPassword) {
        String query = "UPDATE users SET fpassword=? WHERE fpassword=?";
        Connection conn = mysql.openConnection();
        try {
            PreparedStatement stmnt = conn.prepareStatement(query);
            stmnt.setString(1, newPassword);
            stmnt.setString(2, oldPassword);
            int result = stmnt.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            mysql.closeConnection(conn);
        }
}

    public UserData getUserByEmail(String email) {
    String query = "SELECT * FROM users WHERE email=?";
    Connection conn = mysql.openConnection();
    try {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String id = rs.getString("id");
            String fname = rs.getString("fname");
            String phonenumber = rs.getString("phonenumber");
            String fpassword = rs.getString("fpassword");

            return new UserData(id, fname, email, phonenumber, fpassword);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        mysql.closeConnection(conn);
    }
    return null;
}


    public boolean updateAccount(String email, String currentPassword, String newUsername, String newPhone, String newEmail) {
    String query = "UPDATE users SET fname=?, phonenumber=?, email=? WHERE email=? AND fpassword=?";
    Connection conn = mysql.openConnection();
    try {
        PreparedStatement stmnt = conn.prepareStatement(query);
        stmnt.setString(1, newUsername);
        stmnt.setString(2, newPhone);
        stmnt.setString(3, newEmail);
        stmnt.setString(4, email);
        stmnt.setString(5, currentPassword);
        int result = stmnt.executeUpdate();
        return result > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        mysql.closeConnection(conn);
    }
}

    public boolean updateUserPhotoPath(String email, String photoPath) {
    String query = "UPDATE users SET photo_path=? WHERE email=?";
    Connection conn = mysql.openConnection();
    try {
        PreparedStatement stmnt = conn.prepareStatement(query);
        stmnt.setString(1, photoPath);
        stmnt.setString(2, email);
        int result = stmnt.executeUpdate();
        return result > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        mysql.closeConnection(conn);
    }
}


    public String getUserPhotoPath(String email) {
    String query = "SELECT photo_path FROM users WHERE email=?";
    Connection conn = mysql.openConnection();
    try {
        PreparedStatement stmnt = conn.prepareStatement(query);
        stmnt.setString(1, email);
        ResultSet rs = stmnt.executeQuery();
        if (rs.next()) {
            return rs.getString("photo_path");
        }
        return null;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    } finally {
        mysql.closeConnection(conn);
    }
}
    


    public boolean deleteAccount(String email, String password) {
        String query = "DELETE FROM users WHERE email=? AND fpassword=?";
        Connection conn = mysql.openConnection();
        try {
            PreparedStatement stmnt = conn.prepareStatement(query);
            stmnt.setString(1, email);
            stmnt.setString(2, password);
            int result = stmnt.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            mysql.closeConnection(conn);
        }
    }
}
//    public boolean resetPassword(ResetPasswordRequest resetReq){
//        // Step1: write a query in a string
//        String query = "UPDATE users SET fpassword=? WHERE email=?";
//        // Step2: open connection
//        Connection conn = mysql.openConnection();
//        try{
//            //Step3: prepare statement
//            PreparedStatement stmnt = conn.prepareStatement(query);
//            //Step4: use setString to prepare query if needed
//            stmnt.setString(1,resetReq.getPassword());
//            stmnt.setString(2,resetReq.getEmail());
//            //step5: executeQuery or executeUpdate
//            int result = stmnt.executeUpdate();
//            return result>0;
//            
//            
//    } catch (Exception e){
//            return false;
//    } finally {
//            mysql.closeConnection(conn);
//        }
//    }
//  }
