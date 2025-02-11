package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    Player p1 = new Player(123, "John", 100);
    Player p2 = new Player(456, "Jane", 10);

    @Test
    public void FirstPlayerNotRegistered() {
        Game game = new Game();
        game.registerPlayer(p1);
        game.registerPlayer(p2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Jenya", "Jane"));

    }

    @Test
    public void SecondPlayerNotRegistered() {
        Game game = new Game();
        game.registerPlayer(p1);
        game.registerPlayer(p2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Jane", "Jenya"));

    }

    @Test
    public void FirstPlayerWin() {
        Game game = new Game();
        game.registerPlayer(p1);
        game.registerPlayer(p2);

        int expected = 1;
        int actual = game.round("John", "Jane");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SecondPlayerWin() {
        Game game = new Game();
        game.registerPlayer(p1);
        game.registerPlayer(p2);

        int expected = 2;
        int actual = game.round("Jane", "John");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NobodyWin() {
        Game game = new Game();
        game.registerPlayer(p1);
        game.registerPlayer(p2);

        int expected = 0;
        int actual = game.round("Jane", "Jane");
        Assertions.assertEquals(expected, actual);

    }

}
