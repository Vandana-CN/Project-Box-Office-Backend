package com.Proj.movie.security.services;

import com.Proj.movie.models.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

    Booking saveBooking(Booking booking);
    List<Booking> getAllBookings();
    Booking getBookingById(int id);
    void deleteBooking(int id);


}
