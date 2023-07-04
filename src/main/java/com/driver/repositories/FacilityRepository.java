package com.driver.repositories;

import com.driver.model.Facility;

import java.util.List;

public interface FacilityRepository {
    void addFacility(Facility facility);
    List<Facility> getAllFacilities();
}

