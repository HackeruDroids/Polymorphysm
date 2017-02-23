package edu.tomer.java;

import java.time.LocalDateTime;

/**
 * Created by hackeru on 23/02/2017.
 */
public class Animal {
    //properties:
    private final LocalDateTime dateOfBirth;
    private String species = getClass().getSimpleName();

    //constructor
    public Animal() {
        dateOfBirth = LocalDateTime.now();
    }
    //constructor
    public Animal(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void makeSound() {
        System.out.println("Animal Sound");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "dateOfBirth=" + dateOfBirth +
                '}';
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public long getAge(){
        return DateTimeUtils.howManyYearsFromNow(dateOfBirth);
    }
}
