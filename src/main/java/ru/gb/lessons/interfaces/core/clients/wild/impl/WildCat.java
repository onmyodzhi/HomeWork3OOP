package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Swimable, Soundable {
    public WildCat() {
    }
    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    public int runs(){
        System.out.println("Running at 15 km/h");
        return 50;
    }

    @Override
    public void sounds() {
        System.out.println("- Meow-meow-meow-meow! Shh-shh-shh-shh-shh... \n" +
                "- Mia-ya-ya-ya-u! Shh, shh, shh... ");
    }

    @Override
    public int swims() {
        return 3;
    }
}
