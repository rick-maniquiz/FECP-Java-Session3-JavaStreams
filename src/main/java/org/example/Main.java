package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Activity 1 ===");
        List<Integer> numbers1to10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers1to10.stream().filter(n -> n%2 == 1).collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers.toString());
        System.out.println("");

        System.out.println("=== Activity 2 ===");
        List<String> names = List.of("Alice", "Adam", "Bob", "Angela", "Bryan");
        Predicate<String> startsWithA = s -> s.charAt(0) == 'A';
        List<String> namesThatStartsWithA = names.stream().filter(startsWithA).collect(Collectors.toList());
        System.out.println("Names that starts with 'A': " + namesThatStartsWithA.toString());
        System.out.println("");

        System.out.println("=== Activity 3 ===");
        List<Integer> numbers1to5 = List.of(1, 2, 3, 4, 5);
        List<Integer> squareOfNumbers1to5 = numbers1to5.stream().map(n -> {return n*n;}).collect(Collectors.toList());
        System.out.println("Square of numbers 1 to 5: " + squareOfNumbers1to5.toString());
        System.out.println("");

        System.out.println("=== Activity 4 ===");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThanFive = n -> n > 5;
        // Will use the same numbers1to10
        List<Integer> evenNumbersGreaterThan5 = numbers1to10.stream().filter(isEven.and(isGreaterThanFive)).collect(Collectors.toList());
        System.out.println("Even numbers greater than 5: " + evenNumbersGreaterThan5.toString());
        System.out.println("");

        System.out.println("=== Activity 5 ===");
        List<String> tableMates = List.of("Ralph", "Ethan", "Garret", "Aaron", "Rick");
        List<Integer> ageOfTableMates = List.of(19,51,22,35,21);
        List<Person> people = Person.generatePersonList(tableMates, ageOfTableMates);

        System.out.println("Sort by age (ascending):");
        people.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(System.out::println);
        System.out.println("");
        System.out.println("Sort by name (alphabetical):");
        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
        System.out.println("");
        System.out.println("Sort by age (descending):");
        people.stream().sorted((p1, p2) -> p2.getAge() - p1.getAge()).forEach(System.out::println);
        System.out.println("");


    }
}