package introtooop;

public class Student {
    String name;
    int age;
    String status;

    void changeName(String newName){
        this.name = newName;
    }
    
    void pauseCourse(){
        this.status = "pause";
    }
}
