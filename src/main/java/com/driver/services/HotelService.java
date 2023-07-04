package com.driver.services;

import com.driver.model.Facility;
import com.driver.model.Hotel;

import java.util.List;

public interface HotelService {
    String addHotel(Hotel hotel);
    String getHotelWithMostFacilities();
    Hotel updateFacilities(List<Facility> newFacilities, String hotelName);
}

