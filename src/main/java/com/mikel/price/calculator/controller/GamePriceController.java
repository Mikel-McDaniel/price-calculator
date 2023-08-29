package com.mikel.price.calculator.controller;

import com.mikel.price.calculator.model.Game;
import com.mikel.price.calculator.service.GamePriceService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.FileInputStream;
import java.util.Iterator;

public class GamePriceController {

    private GamePriceService service;

    @Autowired
    public GamePriceController(GamePriceService service) {
        this.service = service;
    }

    public Mono<Game> generateGamePrices(FileInputStream excelFile) {

        return service.generateGamePrices(excelFile);
    }

    public static Flux<Row> getRowFlux(FileInputStream inputStream) {
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);

            Iterator<Row> iterator = workbook.getSheetAt(0).iterator();
            iterator.next();
            iterator.remove();
            workbook.close();
            return Flux.fromIterable(() -> iterator);
        } catch(Exception e) {
            System.out.println("SOMETHING HAPPENED");
            throw new RuntimeException();
        }
    }
}
