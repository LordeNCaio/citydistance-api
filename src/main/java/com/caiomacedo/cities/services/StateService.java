package com.caiomacedo.cities.services;

import com.caiomacedo.cities.entities.State;
import com.caiomacedo.cities.repositories.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StateService {

    private final StateRepository stateRepository;

    public Page<State> findAll(Pageable page) {
        return stateRepository.findAll(page);
    }
}
