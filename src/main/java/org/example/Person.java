package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return  this.name + " - " + this.age;
    }

    public static List<Person> generatePersonList(List<String> names, List<Integer> ages){
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            persons.add(new Person(names.get(i), ages.get(i)));
        }

        return persons.stream().toList();
    }
}
