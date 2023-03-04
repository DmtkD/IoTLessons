package model.impl;

import model.School;
import model.University;

public class Lpml implements University, School {

    @Override
    public void printCountOfTeacher() {
        System.out.println(100);
    }

    @Override
    public void countOfMath() {
        System.out.println(150);
    }

    @Override
    public void vstup() {
        System.out.println(10);
    }

    @Override
    public void session(String season) {
        String text = String.format("Початок %s сесії", season);
        System.out.println(text);
    }

    @Override
    public int calculateStudent() {
        return 650;
    }
}
