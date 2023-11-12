package ru.yandex.praktikum.sprint2.Lesson2;

public abstract class GroundTransport implements Transport {
    private final boolean ground;
    private final int wheelsCount;
    public GroundTransport(boolean ground, int wheelsCount) {
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }
// creating empty template methods we need to fill in the child classes
    public abstract boolean isGround();
    public abstract int getWheelsCount();
    //public int getWheelsCount2(){};
}
