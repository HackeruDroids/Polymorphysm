package edu.tomer.java;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Moshe", "Doe", "030404504");
        Person p2 = new Person("Moshe", "Doe", "030404504");

        System.out.println(p1 == p2);


    }
}
