package com.caiomacedo.cities.exceptions.handler;

import com.caiomacedo.cities.exceptions.country.CountryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(CountryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage countryNotFoundException() {
        return new ErrorMessage(
                "Country not found",
                "The given country was not found"
        );
    }

}
