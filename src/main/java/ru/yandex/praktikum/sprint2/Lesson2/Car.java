package ru.yandex.praktikum.sprint2.Lesson2;

public class Car extends GroundTransport {
    private final boolean ground;
    private final int wheelsCount;

    public Car(boolean ground, int wheelsCount) {
        super(ground, wheelsCount);
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        System.out.println("Car");
        return ground;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

}
