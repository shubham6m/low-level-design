package overriding;
/*
when the function having same siganture but exist 
in different ways according to the child & parent heirarchy then 
this is called overriding.
*/
public class Child extends Parent{
    
    @Override 
    void print(){
        System.out.println("Child class method");
    }
}
