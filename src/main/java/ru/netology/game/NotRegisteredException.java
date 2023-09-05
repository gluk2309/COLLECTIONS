package ru.netology.game;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        super("Named player" + playerName + "not found");
    }


}
