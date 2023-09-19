package com.epam.rd.autocode.factory.plot.plot;

import com.epam.rd.autocode.factory.plot.Character;
import com.epam.rd.autocode.factory.plot.Plot;

public class ClassicDisneyPlot implements Plot {
    private final Character hero;
    private final Character beloved;
    private final Character villain;

    public ClassicDisneyPlot(Character hero, Character beloved, Character villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
    }

    @Override
    public String asText() {
        return hero.name() + actOne() +
                hero.name() + " and " + beloved.name() + actTwo() +
                villain.name() + actThree();
    }

    private String actOne() {
        return " is young and adorable. ";
    }

    private String actTwo() {
        return " love each other. ";
    }

    private String actThree() {
        return " interferes with their happiness, but loses in the end.";
    }
}
