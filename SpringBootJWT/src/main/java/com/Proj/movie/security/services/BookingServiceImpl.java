package com.Proj.movie.security.services;

import com.Proj.movie.models.Booking;
import com.Proj.movie.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepo bookingRepo;
    public BookingServiceImpl(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }
    @Override
    public Booking saveBooking(Booking booking)
    {
        return bookingRepo.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }
    @Override
    public void deleteBooking(int id)
    {
        bookingRepo.findById(id);
        bookingRepo.deleteById(id);
    }



    @Override
    public Booking getBookingById(int id) {
        return null;
    }


}
