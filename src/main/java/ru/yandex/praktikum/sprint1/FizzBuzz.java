package ru.yandex.praktikum.sprint1;

public class FizzBuzz {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printer(array);
    }


    public void printer(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (array[i] % 5 == 0) {
                System.out.println("Buzz");
            } else if (array[i] % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}

