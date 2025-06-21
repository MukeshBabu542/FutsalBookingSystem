/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.model;

/**
 *
 * @author aakirti
 */
public class Rating {
    private int userId;
    private int bookingId;
    private int rating;
    private String comment;

    public Rating(int userId, int bookingId, int rating, String comment) {
        this.userId = userId;
        this.bookingId = bookingId;
        this.rating = rating;
        this.comment = comment;
    }

    public int getUserId() { return userId; }
    public int getBookingId() { return bookingId; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
}
    

