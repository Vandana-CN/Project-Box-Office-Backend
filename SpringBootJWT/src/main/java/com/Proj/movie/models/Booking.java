package com.Proj.movie.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BookingId", nullable = false, unique = true)
    private int BookingId;
    @Column(name = "movieName", nullable = false)
    private String movieName;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "seatno", nullable = false)
    private int seatno;
    @Column(name = "date", nullable = false)
    private Date date;

    public Booking()
    {
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int bookingId) {
        BookingId = bookingId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeatno() {
        return seatno;
    }

    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
