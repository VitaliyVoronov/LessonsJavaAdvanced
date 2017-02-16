package ua.itea.homeWork02Generics;

import java.util.Calendar;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/2/17
 */
public class Employee extends Person {

    public Employee(String name, String surName, boolean gender, Calendar birthDay, PhoneNumber phoneNumber, Temperament temperament) {
        super(name, surName, gender, birthDay, phoneNumber, temperament);
    }
}
