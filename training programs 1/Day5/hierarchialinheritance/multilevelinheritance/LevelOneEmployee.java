package Day5.hierarchialinheritance.multilevelinheritance;

import java.time.LocalDate;

public class LevelOneEmployee extends Employee {
    private int bonus;
    private String authority;

    public LevelOneEmployee(String name, long phone, LocalDate dob, String department,
                            double salary, int bonus, String authority) {
        super(name, phone, dob, department, salary);
        this.bonus = bonus;
        this.authority = authority;
    }

    public int getBonus() { return bonus; }
    public String getAuthority() { return authority; }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" LevelOneEmployee [bonus=%d, authority=%s]", bonus, authority);
    }
}
