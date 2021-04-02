package com.caiomacedo.cities.controllers;

import com.caiomacedo.cities.entities.State;
import com.caiomacedo.cities.services.StateService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
@RequiredArgsConstructor
public class StateController {

    private final StateService stateService;
    private static Logger log = LoggerFactory.getLogger(StateController.class);

    @GetMapping
    public Page<State> states(final Pageable page) {
        log.info("states, {}", page);
        return stateService.findAll(page);
    }

}


