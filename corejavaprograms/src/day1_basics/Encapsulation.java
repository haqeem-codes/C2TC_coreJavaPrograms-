package day1_basics;

class Person {
    // Private variables (encapsulation)
    private String name;
    private int age;

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Setter for age
    public void setAge(int a) {
        age = a;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create object
        Person p = new Person();

        // Set values using setter methods
        p.setName("Abinaya");
        p.setAge(21);

        // Get values using getter methods
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
