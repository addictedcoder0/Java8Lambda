package com.rudra.lambda02;

/**
 * Created by abhishek.
 *
 * this is a sample exercise on lambda functions
 */
public class Person {
    private String firstName;
    private String lastname;
    private int age;

    public Person(String firstName, String lastname, int age) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nPerson [ firstName : "+getFirstName()+" , lastName : "+getLastname()+" , Age : "+getAge() +" ]";
    }
}
