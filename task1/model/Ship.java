package ru.babushkina.week4.task1.model;

import ru.babushkina.week4.task1._main.Sailable;

public class Ship implements Sailable {
    @Override
    public void sail() {
        fuel();
        System.out.println("Я корабль и я плыву! Пык-пык-пык!");
    }
    private void fuel() {
        System.out.println("Я корабль и для того, чтобы плыть, мне нужно хорошенько заправиться топливом! Ням-ням-ням!");
    }
}
