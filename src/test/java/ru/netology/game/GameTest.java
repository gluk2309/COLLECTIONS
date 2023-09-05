package ru.netology.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void testNoFirstPlayer() {
        Player player1 = new Player(1, "Алексей", 50);
        Player player2 = new Player(2, "Андрей", 50);
        Game game = new Game();

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Слава", "Андрей"));


    }

    @Test
    public void testNoSecondPlayer() {
        Player player1 = new Player(1, "Алексей", 50);
        Player player2 = new Player(2, "Оля", 50);
        Game game = new Game();

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Алексей", "Андрей"));


    }

    @Test
    public void testDraw() {
        Player player1 = new Player(1, "Слава", 50);
        Player player2 = new Player(2, "Андрей", 50);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        int expected = 0;
        int actual = game.round("Слава", "Андрей");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testFirstPlayerWins() {
        Player player1 = new Player(1, "Дима", 150);
        Player player2 = new Player(2, "Ира", 75);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        int expected = 1;
        int actual = game.round("Дима","Ира" );

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSecondPlayerWins() {
        Player player1 = new Player(1, "Миша", 50);
        Player player2 = new Player(2, "Иван", 75);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        int expected = 2;
        int actual = game.round("Миша", "Иван");

        Assertions.assertEquals(expected, actual);

    }

}
