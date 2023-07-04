package com.driver.services;

import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public String addHotel(Hotel hotel) {
        return hotelRepository.addHotel(hotel);
    }

    @Override
    public String getHotelWithMostFacilities() {
        return hotelRepository.getHotelWithMostFacilities();
    }

    @Override
    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return hotelRepository.updateFacilities(newFacilities, hotelName);
    }
}
