package java;

public abstract class Base
{
    public abstract void addition(int a, int b);

    public  void subtraction(int a, int b)
    {
        int diff =a-b;
        System.out.println(diff);
    }

    public  void multiplication(int a, int b) // Concrete Method
    {
        int product =a*b;
        System.out.println(product);
    }

    public  void division(int a, int b)
    {
        int divide =a/b;
        System.out.println(divide);
    }
}
