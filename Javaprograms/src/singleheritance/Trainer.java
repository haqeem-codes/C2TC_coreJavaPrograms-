package singleheritance;

public class Trainer extends Person {
    private int tid;
    private String specialization;
    private String location;

    // Constructor
    public Trainer(int pid, String name, String city, int tid, String specialization, String location) {
        super(pid, name, city);
        this.tid = tid;
        this.specialization = specialization;
        this.location = location;
    }

    // Getters and Setters
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Trainer [tid=" + tid + ", specialization=" + specialization + ", location=" + location + ", " + super.toString() + "]";
    }
}
