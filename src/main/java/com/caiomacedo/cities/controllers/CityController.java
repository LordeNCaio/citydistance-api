package com.caiomacedo.cities.controllers;

import com.caiomacedo.cities.entities.City;
import com.caiomacedo.cities.services.CityService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    private static Logger log = LoggerFactory.getLogger(CityController.class);

    @GetMapping
    public Page<City> cities(Pageable page) {
        log.info("cities, {}", page);
        return cityService.findAll(page);
    }

}
