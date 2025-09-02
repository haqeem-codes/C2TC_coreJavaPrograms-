package com.tnsif.day5.multilevelinheritance;

import java.time.LocalDate;

public class Person {
    private String name;
    private long phone;
    private LocalDate dob;

    public Person(String name, long phone, LocalDate dob) {
        this.name = name;
        this.phone = phone;
        this.dob = dob;
    }

    public String getName() { return name; }
    public long getPhone() { return phone; }
    public LocalDate getDob() { return dob; }

    @Override
    public String toString() {
        return String.format("Person [name=%s, phone=%d, dob=%s]", name, phone, dob);
    }
}
