package ru.yandex.praktikum.sprint2.Lesson2;

public class Lesson10 {

    public static void main(String[] args) {
        Transport boat = new Boat(false);
        System.out.println("Является ли транспорт наземным: " + boat.isGround());

        GroundTransport motorcycle = new Motorcycle(true, 2);
        System.out.println("Check Motorcylce");
        System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
        System.out.println("Количество колёс: " + motorcycle.getWheelsCount());

        GroundTransport car = new Car(true, 4);
        System.out.println("Check Car Overwritten");
        System.out.println("Является ли транспорт наземным: " + car.isGround());
        System.out.println("Количество колёс: " + car.getWheelsCount());

        Car sportcar = new Sportcar(true, 5);
        System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
        System.out.println("Количество колёс: " + sportcar.getWheelsCount());
    }

}

