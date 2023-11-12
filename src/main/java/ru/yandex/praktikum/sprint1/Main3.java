package ru.yandex.praktikum.sprint1;

class Animal {
    public String say() {
        return "Я животное!";
    }
}

class Dog extends Animal {

    @Override
    public String say() {
        return "Я пёсик!";
    }
}

class Main3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println("Собака говорит: " + dog.say());
        // выведется "Собака говорит: Я пёсик!"
    }
}

