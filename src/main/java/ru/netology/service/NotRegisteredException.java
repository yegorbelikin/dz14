package ru.netology.service;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name)
    {
        super("Игрок" + name + "не зарегистрирован");
    }
}
