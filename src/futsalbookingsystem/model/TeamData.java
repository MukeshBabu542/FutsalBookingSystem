package futsalbookingsystem.model;

public class TeamData {
    private int id;
    private String teamName;
    private int memberCount;
    private String logoPath;
    private String paymentStatus;
    private String userEmail;

    // Constructor
    public TeamData(int id, String teamName, int memberCount, String logoPath, String paymentStatus, String userEmail) {
        this.id = id;
        this.teamName = teamName;
        this.memberCount = memberCount;
        this.logoPath = logoPath;
        this.paymentStatus = paymentStatus;
        this.userEmail = userEmail;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}