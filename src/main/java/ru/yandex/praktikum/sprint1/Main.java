package ru.yandex.praktikum.sprint1;

import java.util.Arrays;

import static ru.yandex.praktikum.sprint1.ArrayHandler.trials;

public class Main {
    public static void main(String[] args) {
        // пробы разных заданий из тренажера
        trials();

        int[] array = {3, 5, 12, -1, 45, 3, 65, 23, 56};
        int[] array2 = {5, 6, 3, 2, 6, 54, 23, 87, 12};

        ArrayHandler arrayHandlerToDefineArrayInMethods = new ArrayHandler(); // другой объект со своим состоянием
        int maxValue = arrayHandlerToDefineArrayInMethods.getMaxElement(array); // получаем массив в метод из вне (из другого класса)
        int minValue = arrayHandlerToDefineArrayInMethods.getMinElement(array);
        System.out.println(maxValue);
        System.out.println(minValue);

        // мы определили массив в классе теста, и передали его параметром в конструктор. Где этот аргумент будет присвоем классовому полю.
        ArrayHandler arrayHandlerArrayGivenInConstructorForAllTheMethodsOnce = new ArrayHandler(array2); // объект со своим состоянием, где в качестве аргумента конструктора идет поле класса
        int maxValue2 = arrayHandlerArrayGivenInConstructorForAllTheMethodsOnce.getMaxElement();
        int minValue2 = arrayHandlerArrayGivenInConstructorForAllTheMethodsOnce.getMinElement();
        System.out.println(maxValue2);
        System.out.println(minValue2);


        System.out.println(Arrays.toString(arrayHandlerToDefineArrayInMethods.reverseArray(array)));
        System.out.println(Arrays.toString(arrayHandlerArrayGivenInConstructorForAllTheMethodsOnce.reverseArray())); // static methods can call without creating the object of the class (f.E. Arrays methods)


        System.out.println(Arrays.toString(arrayHandlerToDefineArrayInMethods.reverseArrayHomework(array)));

        System.out.println(arrayHandlerArrayGivenInConstructorForAllTheMethodsOnce.countEvenElements());
        int evenElements = arrayHandlerArrayGivenInConstructorForAllTheMethodsOnce.countEvenElements();
    }
}

