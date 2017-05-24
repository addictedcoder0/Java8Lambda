package com.rudra.lambda02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek.
 */
public class People {
    // init a Dummy list of Persons to work with
    private static List<Person> people = Arrays.asList(
            new Person("ronny","Caroll",25),
            new Person("Christie","Carlyle",45),
            new Person("john","cena",65),
            new Person("Mathew","Arnold",55),
            new Person("charles","Dickens",22)
    );

    public static List<Person> getPeople() {
        return people;
    }


}
