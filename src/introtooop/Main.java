package introtooop;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shubham";
        s1.age = 22;
        s1.status = "active";

        s1.pauseCourse();
        s1.changeName("mahesh");

        System.out.println("Doing something!!");
    }
}
