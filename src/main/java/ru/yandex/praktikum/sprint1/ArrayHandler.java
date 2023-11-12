package ru.yandex.praktikum.sprint1;

import java.util.Arrays;

public class ArrayHandler {
    public ArrayHandler() {
    }

    private int[] array;
    Integer number = 10; // создали новый объект number
    int number2 = 10;

    public ArrayHandler(int[] array) {
        this.array = array;
    }

    // перегрузка метода, когда убираем дублирование
    public int getMaxElement() {
        return getMaxElement(array);
    }

    //    public int getMaxElement() {
//        int max = array[0]; // here the "array" is taken not as an argument of the method, but the field of the class
//        for (int i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        return max;
//    }

    // сигнатура метода: getMaxElement(int[] array)
    public int getMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void trials(){
        //number.byteValue();
        Integer number = 10; // создали новый объект number
        number.byteValue();

        Integer integer = Integer.max(999, 1000);
        short someNumber = integer.shortValue();


    }

    public int getMinElement() {
        return getMinElement(array);
    }

    public int getMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public int[] reverseArray() {
        return reverseArray(array);
    }
    public int[] reverseArray(int[] array) {
        int[] revertedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            revertedArray[i] = array[array.length - i - 1]; // why (-1): array.length reply 9, but we have {0,1..,8}, if we start from 0, then we need one less
        }
        return revertedArray;
    }

    public int[] reverseArrayHomework(int[] array) {

        for (int i = 0; i != array.length - i - 1; i++) {
            int arrayHelper = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = arrayHelper;
        }
        return array;
    }

    public int countEvenElements(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
