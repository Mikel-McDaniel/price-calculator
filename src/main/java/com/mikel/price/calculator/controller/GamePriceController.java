package com.mikel.price.calculator.controller;

import com.mikel.price.calculator.dao.PriceChartingClient;
import com.mikel.price.calculator.model.Game;
import com.mikel.price.calculator.service.GamePriceService;
import com.mikel.price.calculator.service.RequestValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class GamePriceController {

    private GamePriceService service;
    private RequestValidationService validationService;

    @Autowired
    public GamePriceController(GamePriceService service, RequestValidationService validationService) {
        this.service = service;
        this.validationService = validationService;
    }

    public Mono<Game> generateGamePrices(Object excelSheet) {

        return service.generateGamePrices(excelSheet);
    }
}
