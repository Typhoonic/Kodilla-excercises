package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library>{

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{

        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for(Book book: books){
            Book cloneBook = new Book(book.getTitle(),book.getAuthor(),book.getPublicationDate());
            cloneLibrary.getBooks().add(cloneBook);
        }
        return cloneLibrary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {

        String s = "Library [" + name + "]\n";
        for(Book book: books){
            s = s + book.toString();
        }
        return s;
    }

}
