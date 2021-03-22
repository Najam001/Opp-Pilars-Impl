package Abstraction;

public class AbstractionImplExample {

    public static void main (String args[]){

        Son s = new Son();
        Daughter d =new Daughter ();
        s.disp();
        d.disp();

    }

}

    abstract class Father
    {

       abstract void disp();
    }



    class Son extends Father
    {
        void disp()
        {
            System.out.println("Abstract method implement in Class Son");

        }
    }

class Daughter extends Father
{
    void disp(){

        System.out.println("Abstract method implement in Class Daughter");
    }
}
