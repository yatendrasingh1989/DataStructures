package com.yaten.poc.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExp {
    public static void main(String[] str){
        List<Person> personList= PersonList.getPersons();
        //filter with map; to get only names of the persons
        List<String> ageFilerWithMap=personList.stream().filter(person -> person.getAge()>30).map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(ageFilerWithMap);
    }
}
