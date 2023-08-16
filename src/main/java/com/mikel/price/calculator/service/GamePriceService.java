package com.mikel.price.calculator.service;

import com.mikel.price.calculator.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.util.List;

//@Service
public class GamePriceService {

    private RequestValidationService validationService;

    @Autowired
    public GamePriceService(RequestValidationService validationService) {
        this.validationService = validationService;
    }

    public Mono<Game> generateGamePrices(Object excelSheet) {
        validationService.validateEntry(excelSheet);
        return Mono.empty();
    }
}
