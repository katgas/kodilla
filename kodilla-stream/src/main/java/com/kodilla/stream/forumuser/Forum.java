package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Michael Jackson", 'M', LocalDate.of(1920, 1,10), 157));
        userList.add(new ForumUser(2, "Jonathan Cook", 'M', LocalDate.of(2000, 4, 7), 54));
        userList.add(new ForumUser(3, "Jessica Brooks", 'F', LocalDate.of(1999, 2, 17), 90));
        userList.add(new ForumUser(4, "Ann Shirley", 'F', LocalDate.of(1898, 7, 19), 257));
        userList.add(new ForumUser(5, "Steve Wonder", 'M', LocalDate.of(1775, 10, 25), 85));
        userList.add(new ForumUser(6, "Chris Black", 'M', LocalDate.of(2001, 6, 18), 34));
        userList.add(new ForumUser(7, "John Snow", 'M', LocalDate.of(2009, 8, 9), 175));
        userList.add(new ForumUser(8, "Monica Bullock", 'F', LocalDate.of(2005, 7, 9), 43));
        userList.add(new ForumUser(9, "Tom Hanks", 'M', LocalDate.of(1990, 9, 28), 175));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
