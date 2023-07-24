package com.mikel.price.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

/**
 * Pojo for game object
 */
@Getter
public class Game {
    private String name;
    private Game.Price price;
    private Console console;

    public Game(String name, double price, Instant priceTimestamp, Console console) {
        this.name = name;
        this.price = new Game.Price(price, priceTimestamp);
        this.console = console;
    }

    @Getter
    class Price {
        private double price;
        private Instant priceTimestamp;

        public Price(double price, Instant priceTimestamp) {
            this.price = price;
            this.priceTimestamp = priceTimestamp;
        }
    }

}
