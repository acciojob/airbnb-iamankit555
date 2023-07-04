package com.driver.repositories;

import com.driver.model.Facility;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FacilityRepositoryImpl implements FacilityRepository {

    private final List<Facility> facilities;

    public FacilityRepositoryImpl() {
        this.facilities = new ArrayList<>();
    }

    @Override
    public void addFacility(Facility facility) {
        facilities.add(facility);
    }

    @Override
    public List<Facility> getAllFacilities() {
        return facilities;
    }
}

