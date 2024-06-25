package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    protected String name;
    protected LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Name: " + name + ", Birth Date: " + birthDate.format(formatter);
    }
}
