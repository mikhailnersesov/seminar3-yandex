package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
class CalculatorTest2 { // создали тестовый класс

    private final int firstNumber;
    private final int secondNumber;
    private final int expected; // создали поля тестового класса

    public CalculatorTest2(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected; // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {1, 9, 10},
                {1, 0, 1}, // передали тестовые данные
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }



    }
