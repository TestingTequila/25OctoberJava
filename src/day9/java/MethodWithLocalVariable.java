package day9.java;

public class MethodWithLocalVariable
{

    public  void taxApplicable(int salary)
    {
        double tax= 0.2;
        System.out.println("Tax you have to pay is : " + salary*tax);
    }
}
