package com.mikel.price.calculator.model;

import org.junit.Test;

import java.time.Instant;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    @Test
    public void testGameGetters() {
        Instant now = Instant.now();
        Game game = new Game("Super Mario Bros", 50.52, now, Console.NES);

//        assertEquals(game.getConsole().getText(), "Nintendo Entertainment System");
//        assertEquals(game.getPrice().getPrice(), 50.52);
//        assertEquals(game.getName(), "Super Mario Bros");
//        assertEquals(now, game.getPrice().getPriceTimestamp());
    }

}
