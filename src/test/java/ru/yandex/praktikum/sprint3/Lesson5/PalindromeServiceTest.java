package ru.yandex.praktikum.sprint3.Lesson5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

// добавь аннотацию с раннером
@RunWith(Parameterized.class)
public class PalindromeServiceTest {

    // добавь два поля класса: для проверяемой строки и ожидаемого результата
    private final String checkedText;
    private final boolean expected;

    // напиши конструктор с двумя параметрами
    public PalindromeServiceTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    // напиши метод для получения тестовых данных
    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][]{
                {"anna", true},
                {"anka", false},
                {"q", true},
        };
    }

    // напиши тест
    @Test
    public void shouldCheckPalindrome() {
        PalindromeService palindromeService = new PalindromeService();
        boolean actual = palindromeService.isPalindrome(checkedText);
        assertEquals(expected, actual);
    }
}
