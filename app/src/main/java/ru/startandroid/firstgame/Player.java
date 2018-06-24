package ru.startandroid.firstgame;

/**
 * Created by user on 7/25/2017.
 */

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public CharSequence getName() {
        return (CharSequence) name;
    }
}
