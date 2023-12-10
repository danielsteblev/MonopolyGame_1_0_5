package ru.vsu.cs.util.steblev_d_v.cards;

import ru.vsu.cs.util.steblev_d_v.Player;

import java.util.concurrent.ThreadLocalRandom;

public class TravelCard extends Card {
    public TravelCard(int locationIndex, String color) {
        super("TRAVEL\uD83D\uDE97", locationIndex, color);
    }

    public static void goTravel(Player player){
        int travel = ThreadLocalRandom.current().nextInt(2, 12);
        player.setCurrCardIndex(player.getCurrCardIndex() + travel);
    }
}