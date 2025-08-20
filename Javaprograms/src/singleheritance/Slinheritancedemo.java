package singleheritance;

public class Slinheritancedemo {
    public static void main(String[] args) {
        Trainer t = new Trainer(1, "Musthaqeem", "Puducherry", 1, "Prompt engineer", "Chennai");
        System.out.println(t);

        Person a = new Person(113, "Musthaqeem", "Puducherry");
        System.out.println(a);
    }
}

