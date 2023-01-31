package Homework12;

import java.util.function.BiPredicate;
public class Main {
    public static void main(String[] args) {

        Author dostoevsky = new Author("Федор", "Достоевский");
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book idiot = new Book("Идиот", dostoevsky, 1869);
        Book dogsHeart = new Book("Собачье сердце", bulgakov, 1825);

        dogsHeart.setYearOfPublication(1925);

    }
}