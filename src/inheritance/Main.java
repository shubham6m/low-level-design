package inheritance;

public class Main {
    public static void main(String[] args) {
        
        Student s = new Student();
        s.setName("mahesh");

        System.out.println(s.getName());

        /* 
        here we create an object of a child class i.e. 's'
        and as we want to access the private attributes of parent class we can use getter & setter for that, 
        but how can i access when attributes is private, answer is simple getter & setter is always public 
        that's why you can access it.
        & 's' occupy the memory for the private variable 'name' & 'age' too.
        */

    }
}
