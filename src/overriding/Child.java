package overriding;
/*
when the function having same siganture but exist 
in different ways according to the child & parent heirarchy then 
this is called overriding
*/
public class Child extends Parent{

    @Override 
    void print(){
        System.out.println("Function inside child class");
        super.print();
    }
    
}

/*
@Override : this annotation is used to check the validation only not mandatory to write suppose you write this keyword & 
wrote incorrect spelling of override function for above like prnt() then it give error that this function is not present 
in the parent class, but in general it doesn't show any error it only treat it as a new function
*/
