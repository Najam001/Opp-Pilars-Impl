package Inheritence;

 class ParentClass
{

    public void features()
    {
        System.out.println("Feature A");
        System.out.println("Feature B");
    }
}
 class ChildClass extends ParentClass {
    public void ownFeature()
    {
        System.out.println("Feature C");
    }

}

public  class InheritenceImplementation {
    public static void main(String[] args) {
        // Create an object of the derived class.
        ChildClass d = new ChildClass();

        // Call features() method from the derived class using object reference variable d.
        d.features(); // Call ownFeature() method using reference variable d.
        d.ownFeature();

    }
}
