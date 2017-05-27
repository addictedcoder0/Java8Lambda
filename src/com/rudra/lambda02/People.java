package com.rudra.lambda02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek.
 */
public class People {
    // init a Dummy list of Persons to work with

    private static List<Person> people = Arrays.asList(
            new Person("ronny","Caroll",25 , Gender.Male),
            new Person("Christie","Carlyle",45 ,Gender.Female),
            new Person("john","cena",65 ,Gender.Male),
            new Person("Mary","Chrystus",55,Gender.Female),
            new Person("charles","Dickens",22,Gender.Male)
    );

    public static List<Person> getPeople() {
        return people;
    }


}
