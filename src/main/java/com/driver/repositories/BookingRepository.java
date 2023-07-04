package com.driver.repositories;

import com.driver.model.Booking;

public interface BookingRepository {
    void addBooking(Booking booking);
    Booking getBooking(String bookingId);

    int getBookingsByPerson(int aadharCard);

    int bookARoom(Booking booking);
}

