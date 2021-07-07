package com.kodilla.patterns.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static long getCountEmptyStringUsingJava8(List<String> strings){

        Long count = strings.stream()
                .filter(n -> n.equals(""))
                .count();

        return count;
    }

    public static long getCountLength3UsingJava8(List<String> strings){

        Long count = strings.stream()
                .filter(n -> n.length() == 3)
                .count();

        return count;
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {

        List<String> correct = strings.stream()
                .filter(n -> !n.equals(""))
                .collect(Collectors.toList());

        return correct;
    }

    public static String getMergedStringUsingJava8(List<String> strings, String comparator){

        String mergeList = strings.stream()
                .filter(n -> !n.equals(""))
                .collect(Collectors.joining(comparator));

        return mergeList;
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers){

        List<Integer> squares = numbers.stream()
                .distinct()
                .map(n -> (int)Math.pow(n, 2))
                .collect(Collectors.toList());

        return squares;
    }

    public static Integer getMaxJava8(List<Integer> numbers){

        Integer max = numbers.stream()
                .mapToInt(n -> n)
                .max().orElseThrow(NoSuchFieldError::new);

        return max;
    }

    public static Integer getMinJava8(List<Integer> numbers){

        Integer min = numbers.stream()
                .mapToInt(n -> n)
                .min().orElseThrow(NoSuchElementException::new);

        return min;
    }

    public static Integer getSumJava8(List<Integer> numbers){

        Integer sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        return sum;
    }

    public static Integer getAverageJava8(List<Integer> numbers){

        Integer average = numbers.stream()
                .mapToInt(n -> n)
                .average()
                .stream()
                .mapToInt( n -> (int) n)
                .findFirst().orElse(-1);

        return average;
    }

}
