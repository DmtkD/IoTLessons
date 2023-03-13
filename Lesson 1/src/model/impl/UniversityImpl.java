package model.impl;

import model.University;

public class UniversityImpl implements University {
    @Override
    public void vstup() {
        System.out.println("Вітаю в Лапітесі");
    }

    @Override
    public void session(String season) {
        String text = String.format("Початок %s сесії", season);
        System.out.println(text);
    }

    @Override
    public int calculateStudent() {
        return 3000;
    }
}
