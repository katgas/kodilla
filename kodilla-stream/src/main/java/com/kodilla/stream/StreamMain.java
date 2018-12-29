package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import static java.time.temporal.ChronoUnit.YEARS;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(post -> post.getPostsCount() > 0)
                .filter(userAge -> YEARS.between(userAge.getDateBirth(), LocalDate.now()) >= 20)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("Number of users: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
