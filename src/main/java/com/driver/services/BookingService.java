package com.driver.services;

import com.driver.model.Booking;

public interface BookingService {
    int bookARoom(Booking booking);
    int getBookingsByPerson(int aadharCard);
}