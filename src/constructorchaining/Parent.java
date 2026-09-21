package constructorchaining;

public class Parent extends GrandParent{
        private int a;
        private int b;

        //constructor modified
        Parent(){
            super();
            System.out.println("Parent Constructor called");
        }
}
