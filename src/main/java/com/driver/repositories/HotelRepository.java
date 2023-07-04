package com.driver.repositories;

import com.driver.model.Facility;
import com.driver.model.Hotel;

import java.util.List;

public interface HotelRepository {
    void addHotel(Hotel hotel);
    Hotel getHotel(String hotelName);
}

