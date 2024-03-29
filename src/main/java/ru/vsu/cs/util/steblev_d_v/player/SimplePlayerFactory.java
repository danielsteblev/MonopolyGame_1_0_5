package ru.vsu.cs.util.steblev_d_v.player;

public class SimplePlayerFactory {
    public Player createPlayer(PlayerType type, String name){
        Player player = null;
        switch (type){
            case PERSON -> player = new Person(name);
            case BOT -> player = new Bot(name);
        }
        return player;
    }
}
