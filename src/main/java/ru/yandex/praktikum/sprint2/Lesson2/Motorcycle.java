package ru.yandex.praktikum.sprint2.Lesson2;

public class Motorcycle extends GroundTransport {
    private final boolean ground;
    private final int wheelsCount;

    public Motorcycle(boolean ground, int wheelsCount) {
        super(ground, wheelsCount);
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        System.out.println("Motorcycle");
        return ground;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }
}
