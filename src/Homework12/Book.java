package Homework12;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book (String name, Author author, int yearOfPublication){
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getYearOfPublication(){
        return  this.yearOfPublication;
    }

    public void setYearOfPublication(int year){
        this.yearOfPublication = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublication);
    }

    @Override
    public String toString() {
        return name + " " + author + " " + yearOfPublication;
    }
}
