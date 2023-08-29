package com.mikel.price.calculator.controller;

import com.mikel.price.calculator.model.Console;
import com.mikel.price.calculator.model.Game;
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
import java.util.List;

public class GamePriceControllerTest {

    @Test
    public void testExcelParsing() throws URISyntaxException, FileNotFoundException {
        URL resource = getClass().getClassLoader().getResource("Game Selling list.xlsx");
        File file = new File(resource.toURI());
        FileInputStream fileInputStream = new FileInputStream(file);
        Flux<Row> rowFlux = GamePriceController.getRowFlux(fileInputStream);
        List<Game> games = rowFlux.map(row -> {
            Cell nameCell = row.getCell(0);
            Cell consoleCell = row.getCell(1);
            Cell boxCell = row.getCell(2);
            Cell priceCell = row.getCell(3);
            Cell soldForCell = row.getCell(4);
            System.out.println("CELL: " + nameCell.getStringCellValue());

            return new Game(nameCell.getStringCellValue(), priceCell.getNumericCellValue(), null, Console.valueOf(consoleCell.getStringCellValue()));
        }).collectList().block();
        System.out.println();
    }
}
