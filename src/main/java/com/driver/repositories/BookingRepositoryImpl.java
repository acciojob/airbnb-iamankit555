package com.driver.repositories;

import com.driver.model.Booking;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookingRepositoryImpl implements BookingRepository {

    private final Map<String, Booking> bookings;

    public BookingRepositoryImpl() {
        this.bookings = new HashMap<>();
    }

    @Override
    public void addBooking(Booking booking) {
        bookings.put(booking.getBookingId(), booking);
    }

    @Override
    public Booking getBooking(String bookingId) {
        return bookings.get(bookingId);
    }
}

