package com.mikel.price.calculator.model;

public enum Console {
    PSX("Playstation"),
    PS2("Playstation 2"),
    PS3("Playstation 3"),
    PS4("Playstation 4"),
    PS5("Playstation 5"),
    PSP("PSP"),
    VITA("Sony Vita"),

    NES("Nintendo Entertainment System"),
    SNES("Super Nintendo Entertainment System"),
    N64("Nintendo 64"),
    WII("Wii"),
    WII_U("Wii U"),
    SWITCH("Switch"),
    GB("Gameboy"),
    GBA("Gameboy Advance"),
    NINTENDO_3DS("3DS"),

    XBOX("Xbox"),
    XBOX360("Xbox 360"),
    XBOX_ONE("Xbox One"),
    XBOX_SERIES_X("Xbox Series X");

    private final String text;

    Console(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
