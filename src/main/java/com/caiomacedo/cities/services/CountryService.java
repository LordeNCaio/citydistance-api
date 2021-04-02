package com.caiomacedo.cities.services;

import com.caiomacedo.cities.entities.Country;
import com.caiomacedo.cities.exceptions.country.CountryNotFoundException;
import com.caiomacedo.cities.repositories.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Page<Country> findAll(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

    public Country findById(Long id) {
        return countryRepository.findById(id).orElseThrow(CountryNotFoundException::new);
    }
}
