/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.model;

/**
 *
 * @author ASUS
 */
public class ChangePassword {
    

public class UserData {
    private String username;
    private String password;

    // Simulated current user (in-memory)
    private static UserData currentUser;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Simulate login by setting current user
    public static void setCurrentUser(UserData user) {
        currentUser = user;
    }

    public static UserData getCurrentUser() {
        return currentUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

}
