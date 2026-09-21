package overloading;

public class Demo {

    // method 1
    void print(String s){
        System.out.println("print method 1 " + s);
    }

    // method 2
    void print(){
        System.out.println("print method 2");
    }
    
    // method 3
    void print(String s, int a){
        System.out.println("print method 3 " + s + " " + a);
    }

    //method 4
    void print(int a, String s){
        System.out.println("print method 4 " + a + " " + s);
    }
}
