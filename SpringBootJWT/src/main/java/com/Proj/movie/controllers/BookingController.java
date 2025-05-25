package com.Proj.movie.controllers;

import com.Proj.movie.models.Booking;
import com.Proj.movie.security.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/test/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking)
    {
        System.out.println(booking);
        return new ResponseEntity<Booking>(bookingService.saveBooking(booking), HttpStatus.CREATED);
    }
    @GetMapping("/allbookings")
    public List<Booking> getAllBookings()
    {
        return bookingService.getAllBookings();
    }
    @GetMapping("{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Booking>(bookingService.getBookingById(id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable("id")int id)
    {
        bookingService.deleteBooking(id);
        return new ResponseEntity<String>("Student deleted successfully",HttpStatus.OK);
    }


}
