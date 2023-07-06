package ru.gb.lessons.interfaces.core.clients;


public class Human {
    protected final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
