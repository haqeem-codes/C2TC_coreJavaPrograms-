public class DemoStudent {
    public static void main(String[] args) {
        // First student
        Student s = new Student();
        s.setSid(101);
        s.setSname("Raja");
        s.setAvg(89.5f);
        System.out.println(s);

        // Second student
        Student s1 = new Student();
        s1.setSid(102);
        s1.setSname("Priya");
        s1.setAvg(92.3f);
        System.out.println(s1);
    }
}
