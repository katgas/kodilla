package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        //with exclamation mark at the end..
        /*movieStore.getMovies().entrySet().stream()
                .map(s -> s.getValue().toString())
                .map(s -> s.substring(1).replaceFirst("]", " ! ").replace(", ", " ! " ))
                .forEach(System.out::print);*/

        //without exclamation mark at the end..
        /*String movieList = movieStore.getMovies().entrySet().stream()
                .map(s -> s.getValue().toString())
                .map(s -> s.substring(1).replaceFirst("]", "").replace(", ", " ! "))
                .collect(Collectors.joining(" ! "));

        System.out.println(movieList);*/

        //proper way to do it..
        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(movies);
    }
}



