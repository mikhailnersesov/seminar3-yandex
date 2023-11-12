package ru.yandex.praktikum.sprint1;

public class Main2 {

    public static void main(String[] args) {
        Pointillist pointillist = new Pointillist();
        pointillist.response("пуантилист");

        Impressionist impressionist = new Impressionist();
        impressionist.response("импрессионист");
        // здесь создай объекты
    }
}

class Artist {

    public void response(String artistSpecialisation){
        System.out.println("Художник - " + artistSpecialisation);
    }

}


class Pointillist extends Artist{
}
class Impressionist extends Artist{
}
// создай классы с конструкторами
