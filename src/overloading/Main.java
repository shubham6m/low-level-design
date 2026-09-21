package overloading;

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.print();
        d.print("Shubham");
        d.print(1, "mahesh");
        d.print("ramesh", 5);
    }
}
