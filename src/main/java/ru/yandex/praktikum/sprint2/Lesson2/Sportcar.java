package ru.yandex.praktikum.sprint2.Lesson2;

public class Sportcar extends Car {

    private final boolean ground;
    private final int wheelsCount;

    public Sportcar(boolean ground, int wheelsCount) {
        super(ground, wheelsCount);
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        System.out.println("Sportcar");
        return ground;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }

}
