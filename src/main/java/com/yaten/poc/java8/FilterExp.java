package com.yaten.poc.java8;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExp{

    public static void main(String... args){
        List<Person> personList= PersonList.getPersons();
        System.out.println(personList);
        List<Person> ageFiler=personList.stream().filter(person->person.getAge()>30).collect(Collectors.toList());
        System.out.println(ageFiler.toString());
    }
}
