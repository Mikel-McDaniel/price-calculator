package com.mikel.price.calculator.controller;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;
import reactor.core.publisher.Flux;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

public class GamePriceControllerTest {

    @Test
    public void testExcelParsing() throws URISyntaxException, FileNotFoundException {
//        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream();

        URL resource = getClass().getClassLoader().getResource("Game Selling list.xlsx");
        File file = new File(resource.toURI());
        FileInputStream fileInputStream = new FileInputStream(file);
        Flux<Row> rowFlux = GamePriceController.getRowFlux(fileInputStream);
        rowFlux.map(row -> {
            Cell cell = row.getCell(0);
            System.out.println("CELL: " + cell.getStringCellValue());

            return row;
        }).collectList().block();
        System.out.println();
    }
}
