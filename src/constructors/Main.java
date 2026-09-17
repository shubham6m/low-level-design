package constructors;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Ram", 45);
        // s.name = "Mukesh";
        // s.age = 21;
        // s.changeAge(23);

        Student copy = new Student(s);
        System.out.println(copy.name + " " + copy.age);

        System.out.println(s.name + " " + s.age);
    }
}
