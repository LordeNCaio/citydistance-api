package com.caiomacedo.cities.controllers;

import com.caiomacedo.cities.entities.Country;
import com.caiomacedo.cities.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Country> getCountries() {
        return countryService.findAll();
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.FOUND)
    public Page<Country> getCountries(Pageable pageable) {
        return countryService.findAll(pageable);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Country getById(@PathVariable Long id) {
        return countryService.findById(id);
    }
}
