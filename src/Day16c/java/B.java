package Day16c.java;

public class B implements Base
{

    @Override
    public void addition(int a, int b) {
        System.out.println("addition: "+ (2*a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("addition: "+ (2*a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("addition: "+ (2*a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("addition: "+ (2*a/b));
    }
}
