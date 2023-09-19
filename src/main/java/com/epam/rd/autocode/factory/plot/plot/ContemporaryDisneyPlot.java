package com.epam.rd.autocode.factory.plot.plot;

import com.epam.rd.autocode.factory.plot.Character;
import com.epam.rd.autocode.factory.plot.EpicCrisis;
import com.epam.rd.autocode.factory.plot.Plot;

public class ContemporaryDisneyPlot implements Plot {
    private final Character hero;
    private final EpicCrisis epicCrisis;
    private final Character funnyFriend;

    public ContemporaryDisneyPlot(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }

    @Override
    public String asText() {
        return actOne() + hero.name() +
                actTwo() + epicCrisis.name() + ". " + hero.name() +
                actThree() + funnyFriend.name() + ", " + hero.name() + " " +
                actFour();
    }

    private String actOne() {
        return "In the beginning, ";
    }

    private String actTwo() {
        return " feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - ";
    }

    private String actThree() {
        return " stands up against it, but with no success at first. But then, by putting self together and with the help of friends, including spectacular, funny ";
    }

    private String actFour() {
        return "restores the spirit, overcomes the crisis and gains gratitude and respect.";


    }
}
