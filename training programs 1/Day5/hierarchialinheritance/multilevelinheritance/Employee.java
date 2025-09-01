package Day5.hierarchialinheritance.multilevelinheritance;

import java.time.LocalDate;

public class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name, long phone, LocalDate dob, String department, double salary) {
        super(name, phone, dob);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" Employee [department=%s, salary=%.1f]", department, salary);
    }
}
