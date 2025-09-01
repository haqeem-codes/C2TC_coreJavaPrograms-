package com.tnsif.day5.multilevelinheritance;

import java.time.LocalDate;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Person object
        Person p1 = new Person("Atharv", 78787676761L, LocalDate.of(2000, 12, 2));
        System.out.println(p1);

        // Employee object
        p1 = new Employee("Pranav", 80808070701L, LocalDate.of(1995, 5, 7),
                          "Sales", 45000);
        System.out.println(p1);

        // LevelOneEmployee object
        p1 = new LevelOneEmployee("Madhur", 98880872271L, LocalDate.of(1988, 2, 15),
                                  "Account", 85000, 200, "Signing Authority");
        System.out.println(p1);
    }
}
