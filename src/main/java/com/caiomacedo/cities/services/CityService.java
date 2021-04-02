package com.caiomacedo.cities.services;

import com.caiomacedo.cities.entities.City;
import com.caiomacedo.cities.repositories.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public Page<City> findAll(Pageable page) {
        return cityRepository.findAll(page);
    }
}
