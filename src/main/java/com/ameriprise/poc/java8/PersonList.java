package com.ameriprise.poc.java8;

import java.util.Arrays;
import java.util.List;

public interface PersonList {
    public static  List<Person> getPersons(){
        return Arrays.asList(new Person("Amit",35,"MALE"),new Person("Vishal",30,"MALE"),
                new Person("Deepali",32,"FEMALE"), new Person("Divya",34,"FEMALE"),
                new Person("Dinesh",38,"MALE"), new Person("Yatendra",28,"MALE"));
    }
}
