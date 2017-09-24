package com.ameriprise.poc.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExp {

    private static List<Person> getPerson(){
        return Arrays.asList(new Person("Amit",35,"MALE"),new Person("Vishal",30,"MALE"),
                new Person("Deepali",32,"FEMALE"), new Person("Divya",34,"FEMALE"),
                new Person("Dinesh",38,"MALE"), new Person("Dinesh",28,"MALE"));
    }

    public static void main(String... args){
        List<Person> personList=getPerson();
        List<Person> ageFiler=personList.stream().filter(person->person.getAge()>30).collect(Collectors.toList());
        System.out.println(ageFiler.toString());
        //filter with map; to get only names of the persons
        List<String> ageFilerWithMap=personList.stream().filter(person -> person.getAge()>30).map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(ageFilerWithMap);
    }
}
