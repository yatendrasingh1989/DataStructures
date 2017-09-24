package com.ameriprise.poc.java8;
import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortingUsingStream {

    private static List<Person> getPerson(){
        List<Person> personList= Arrays.asList(new Person("Amit",35,"MALE"),new Person("Vishal",30,"MALE"),
                new Person("Deepali",32,"FEMALE"), new Person("Divya",34,"FEMALE"),
                new Person("Dinesh",38,"MALE"), new Person("Dinesh",28,"MALE"));
        return personList;
    }

    private static void printSorted(List<Person> personList, Comparator<Person> comparator){
        personList.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
    public static void main(String args[]){
        List<Person> persons=getPerson();
        persons.stream().sorted(comparing(Person::getName).thenComparing(Person::getAge)).forEach(System.out::println);
       /* printSorted(persons,comparing(Person::getName)
                .thenComparing(Person::getAge));*/
    }
}
