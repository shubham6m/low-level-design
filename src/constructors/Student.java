package constructors;

public class Student {
    String name;
    int age;

    void changeAge(int newAge){
        age = newAge;
    }

    // constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student other){
        name = other.name;
        age = other.age;
    }
}
