package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Book book1 = new Book("Alice's Adventures in Wonderland", "L. Carroll",
                LocalDate.of(1865,10,12));
        Book book2 = new Book("Harry Potter", "J. K. Rowling",
                LocalDate.of(1997, 2,10));
        Book book3 = new Book("Awaken The Giant Within", "A. Roberts",
                LocalDate.of(1991, 5, 28));
        Book book4 = new Book("The Wisdom Of Psychopaths", "K. Dutton",
                LocalDate.of(2012, 9, 20));
        Book book5 = new Book("Crime And Punishment", "F. Dostoyevsky",
                LocalDate.of(1866, 10,30));

        //creating the library and assigning the books
        Library library = new Library("The Great Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //making a shallow copy of object library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book1);

        //then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowClonedLibrary.getBooks());
        Assert.assertNotEquals(library, deepClonedLibrary);


        //even though they look the same, they have different hashCode.
        int hashCodeLibrary = System.identityHashCode(System.identityHashCode(library));
        int hashCodeShallowLibrary = System.identityHashCode(System.identityHashCode(shallowClonedLibrary));

        Assert.assertNotEquals(hashCodeLibrary, hashCodeShallowLibrary);

        System.out.println("The Great Library hashCode: "+ hashCodeLibrary);
        System.out.println("Shallow Library hashCode: " + hashCodeShallowLibrary);
    }
}
