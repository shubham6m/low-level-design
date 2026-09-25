package abstractclasses;
/*
as i create this class as abstact class we cannot create the object of this class, 
only it's child classes can access the metheods & attributes of this classes
*/
public abstract class User {
    //normal method
    void saySomething(){
        System.out.println("User class method");
    }
    //abstact method : these methods doesn't have a body
    abstract void printName();
}
