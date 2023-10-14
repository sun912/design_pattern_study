package me.sun.designpatterns._01_creational_patterns._05_prototype._03_practice;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

class BookShelf implements Cloneable {
    private List<Book> shelf = new ArrayList<>();

    public List<Book> getShelf() {
        return shelf;
    }

    public void setShelf(List<Book> shelf) {
        this.shelf = shelf;
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelf another = new BookShelf();
        for (Book book : shelf){
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }
        return another;

    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "shelf=" + shelf.toString() +
                '}';
    }
}

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("조정래", "태백산맥"));
        bookShelf.addBook(new Book("박완서", "나목"));
        bookShelf.addBook(new Book("박경리", "토지"));

        System.out.println(bookShelf);

        BookShelf another = (BookShelf)bookShelf.clone();

        System.out.println(another);

        bookShelf.getShelf().get(0).setAuthor("michale");
        bookShelf.getShelf().get(0).setTitle("hello dear");

        System.out.println(bookShelf);
        System.out.println(another);

    }
}
