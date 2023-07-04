package com.driver.controllers;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import com.driver.services.BookingService;
import com.driver.services.HotelService;
import com.driver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/hotel")
public class HotelManagementController {

    private final HotelService hotelService;
    private final UserService userService;
    private final BookingService bookingService;

    @Autowired
    public HotelManagementController(HotelService hotelService, UserService userService, BookingService bookingService) {
        this.hotelService = hotelService;
        this.userService = userService;
        this.bookingService = bookingService;
    }

    @PostMapping("/add-hotel")
    public String addHotel(@RequestBody Hotel hotel) {
        if (hotel == null || hotel.getHotelName() == null) {
            return "FAILURE";
        }
        String result = hotelService.addHotel(hotel);
        if (Objects.equals(result, "SUCCESS")) {
            return "SUCCESS";
        } else {
            return "FAILURE";
        }
    }

    @PostMapping("/add-user")
    public Integer addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/get-hotel-with-most-facilities")
    public String getHotelWithMostFacilities() {
        return hotelService.getHotelWithMostFacilities();
    }

    @PostMapping("/book-a-room")
    public int bookARoom(@RequestBody Booking booking) {
        booking.setBookingId(UUID.randomUUID().toString());
        int amountToBePaid = booking.getNumberOfRooms() * booking.getPricePerNight();
        booking.setAmountToBePaid(amountToBePaid);
        return bookingService.bookARoom(booking);
    }

    @GetMapping("/get-bookings-by-a-person/{aadharCard}")
    public int getBookings(@PathVariable("aadharCard") Integer aadharCard) {
        return bookingService.getBookingsByPerson(aadharCard);
    }

    @PutMapping("/update-facilities")
    public Hotel updateFacilities(@RequestBody List<Facility> newFacilities, @RequestParam("hotelName") String hotelName) {
        return hotelService.updateFacilities(newFacilities, hotelName);
    }
}
