package com.driver.services;

import com.driver.model.Booking;
import com.driver.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public int bookARoom(Booking booking) {
        // Implementation logic to book a room
        return bookingRepository.bookARoom(booking);
    }

    @Override
    public int getBookingsByPerson(int aadharCard) {
        // Implementation logic to get bookings by person
        return bookingRepository.getBookingsByPerson(aadharCard);
    }
}
