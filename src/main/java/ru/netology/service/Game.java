package ru.netology.service;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Player> players = new ArrayList<Player>();

    public void registerPlayer(Player player) {
        players.add(player);
    }

    public int round (String playerName1, String playerName2) {
        Player p1 = null;
        Player p2 = null;
        for (Player p : players) {
            if (p.getName().equals(playerName1)) {
                p1 = p;
            }
            if (p.getName().equals(playerName2)) {
                p2 = p;
            }
        }

        if (p1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (p2 == null) {
            throw new NotRegisteredException(playerName2);
        }

        if (p1.getStrenght() > p2.getStrenght()) {
            return 1;
        } else if (p1.getStrenght() < p2.getStrenght()) {
            return 2;
        } else return 0;
    }


}
