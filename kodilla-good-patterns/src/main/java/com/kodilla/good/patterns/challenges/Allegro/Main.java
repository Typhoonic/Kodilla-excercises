package com.kodilla.good.patterns.challenges.Allegro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        MovieStory movieStory = new MovieStory();
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations = movieStory.getMovies();

        booksTitlesWithTranslations.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .forEach(s -> System.out.print(s + "!"));


    }

}
