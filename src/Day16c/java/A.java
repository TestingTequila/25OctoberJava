package Day16c.java;

public class A implements   Base
{

    @Override
    public void addition(int a, int b) {
        System.out.println("addition: "+ (a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("subtraction: "+ (a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("multiplication: "+ (a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("division: "+ (a/b));
    }
}
