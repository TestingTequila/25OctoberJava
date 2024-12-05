package Day12.java;

public class Maths
{
    int num1;
    static int num2;
    public  void addition()
    {
        System.out.println("addition");
        Maths m2 = new Maths();
        m2.multiplication();
        multiplication();
        Maths.subtraction();
    }

    public static void subtraction()
    {
        System.out.println("subtraction");
        division();
        Maths.division();
        Maths m3= new Maths();
        m3.addition();
    }

    public static void division()
    {
        System.out.println("division");
        subtraction();
        Maths.subtraction();
    }

    public  void multiplication()
    {
        System.out.println("multiplication");
        addition();
        num1=23;
    }
}
