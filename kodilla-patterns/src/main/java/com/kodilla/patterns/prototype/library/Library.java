package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
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
        String b = "Library [" + name + "]\n";
        for(Book bookList : books) {
            b = b + bookList.toString() + "\n";
        }
        return b;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theBookList : books) {
            Book clonedBooks = new Book(theBookList.getTitle(), theBookList.getAuthor(),
                    theBookList.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBooks);
        }
        return clonedLibrary;
    }
}
