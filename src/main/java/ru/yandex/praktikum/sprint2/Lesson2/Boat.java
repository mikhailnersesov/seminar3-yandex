package ru.yandex.praktikum.sprint2.Lesson2;

public class Boat implements Transport {

    private final boolean ground;

    public Boat(boolean ground) {
        this.ground = ground;
    }

    // override the empty parent method
    @Override
    public boolean isGround() {
        System.out.println("Boat");
        return ground;
    }
    //public int getWheelsCount(){return 0;};
}
