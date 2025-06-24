package futsalbookingsystem.model;

public class UserData {

    private String email;
    private String password;
    private String name;
    private String id;
    private String phonenumber;
    private String photoPath;
    
    

    public UserData(String name, String email, String phonenumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.photoPath = photoPath;
    }

    public String getPhotoPath() {
        return photoPath;
    }
    
    public UserData(String id, String name, String email, String phonenumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    // ✅ Change Password Method
    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }
}
