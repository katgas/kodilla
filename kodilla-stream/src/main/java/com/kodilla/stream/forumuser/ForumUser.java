package com.kodilla.stream.forumuser;

import java.time.LocalDate;


public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateBirth;
    private final int postsCount;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate dateBirth, final int postsCount) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateBirth = dateBirth;
        this.postsCount = postsCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser {" +
                "userID = " + userID +
                ", userName = '" + userName + '\'' +
                ", sex = " + sex +
                ", dateBirth = " + dateBirth +
                ", postsCount = " + postsCount +
                '}';
    }
}
