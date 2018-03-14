package com.yaten.poc.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamExample {
    public static void main(String[] args){
    /*    List<String> list= new ArrayList<String>();
        for(int i=0;i<10;i++)
            list.add("String"+i);
      *//*  System.out.println(list.stream().count());*//*
        list.stream().forEach(item->System.out.println(item.concat("Yatendra")));

        Predicate<String> pr1= (str)->str.contains("g5");
        list.stream().filter(pr1).forEach(System.out::println);*/

        List<Person> persons=new ArrayList<>();
        persons.add(new Person("Vishal",29,"MALE"));
        persons.add(new Person("Tabish",30,"MALE"));
        persons.add(new Person("Sourabh",33,"MALE"));
        persons.add(new Person("Sourabh",53,"MALE"));
        persons.add(new Person("Gajpal",30,"MALE"));
        Consumer<String> cnsmr= System.out::println;
        //persons.forEach(person ->cnsmr.accept(person.getName()));

        Predicate<Person> pr1= person->person.getName().startsWith("S");
        Predicate<Person> pr2=person->person.getAge()>40;
        Consumer<Person> cnsmr2=person ->{
           System.out.println(person.toString());
        } ;
        persons.stream().filter(pr2.and(pr1)).forEach(cnsmr2);

    }
}
