package ru.yandex.praktikum; // это обращение к пакету с классом; Чтобы указать, что класс принадлежит определенному пакету, надо в начале файла написать слово package и имя пакета: package ru.yandex.praktikum;
import java.util.Random;
import java.util.Date;
import java.util.*; // Теперь можно работать со всеми классами пакета java.util
public class HelloMaven {
    public static void main(String[] args) {
        //Thema 9:
        System.out.println("Hello, Maven!");

        //Thema 10: Lesson 2:
        Random random = new Random(); // Генерирует случайное число
        Date date = new Date(); // При использовании конструктора без параметров получим текущую дату и время на момент создания объекта
        System.out.println(date); // Выводим получившуюся дату
    }
} 