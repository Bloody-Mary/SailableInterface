package ru.babushkina.week4.task1.model;

import ru.babushkina.week4.task1._main.Sailable;

public class Fish implements Sailable {
    @Override
    public void sail() {
        eat();
        System.out.println("Я рыбка и я плыву! Буль-буль-буль!");
    }
    private void eat() {
        System.out.println("Я рыбка и для того, чтобы плавать, мне нужно хорошенько подкрепиться вкусным планктоном! Ом-ном-ном!");
    }
}
