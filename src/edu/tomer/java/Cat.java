package edu.tomer.java;

import java.util.Scanner;

/**
 * Created by hackeru on 23/02/2017.
 */
public class Cat extends Animal {
    private String species;
    private String name;

    public Cat() {
        super();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name for your "  + species);
        name = scan.next();
    }
}
