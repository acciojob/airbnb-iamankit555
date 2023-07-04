package com.driver.repositories;

import com.driver.model.Facility;
import com.driver.model.Hotel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class HotelRepositoryImpl implements HotelRepository {

    private final Map<String, Hotel> hotels;

    public HotelRepositoryImpl() {
        this.hotels = new HashMap<>();
    }

    @Override
    public void addHotel(Hotel hotel) {
        hotels.put(hotel.getHotelName(), hotel);
    }

    @Override
    public Hotel getHotel(String hotelName) {
        return hotels.get(hotelName);
    }
}

