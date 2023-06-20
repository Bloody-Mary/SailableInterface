package ru.babushkina.week4.task1._main;

import ru.babushkina.week4.task1.model.Fish;
import ru.babushkina.week4.task1.model.Ship;
import ru.babushkina.week4.task1.service.SailExecutor;

public class _MainClass {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();
        SailExecutor sailExecutor = new SailExecutor();

        sailExecutor.makeSail(fish);
        sailExecutor.makeSail(ship);
    }
}