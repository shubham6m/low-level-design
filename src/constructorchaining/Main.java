package constructorchaining;
/*
when we create the instance of child class it calls the constructor of parent class first then run th child class constructor
*/
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        
        Parent p = new Parent();
    }
}
