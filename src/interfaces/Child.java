package interfaces;

/*
public class Child extends Parent, Grandparent{
    
}

this above type structure is not a valid structure in java bcuz if the two parents : parentA & parentB class
contains the same method then if i create the object of child class & 
calls that common function then the ambiguity comes, & 
it is hard to decide which function should call either of parentA or parentB, so this problem is called diamond problem to manage this 
interface comes into picture which only keeps the function name not the implemention every function should be mandatory to 
define in the child : it should be public like below void print method is public

Also default method in the interfaces can have a body, but normal default can't have.
*/
public class Child implements ParentA, ParentB{

    @Override 
    public void print(){
        System.out.println("Child method");;
    }
}
