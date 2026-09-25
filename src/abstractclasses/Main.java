package abstractclasses;

public class Main {
    public static void main(String[] args) {
        // User u = new User(); //you are not allowed to create the object of the user classes
        User m = new Mentor();
        User s = new Student();

        m.saySomething();
        m.printName();
    }
}
