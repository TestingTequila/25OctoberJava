package day24.java;

public class ThrowsKeyword
{
    public  void m1()
    {
        System.out.println("m1 method...");
            m2();
    }

    public  void m2()
    {
        System.out.println("m2 method...");
        try {
            m3();
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(" Will this statement in method 3 be printed ?");
        }
        finally {
            System.out.println("This is finally block of code....");
        }
        System.out.println("Hello..............");
    }

    public  void m3 () throws ArithmeticException
    {
        System.out.println("m3 method...");
        int a = 10;
        int b= 0;
        int c = a/b;

    }

    public static void main(String[] args) {
        ThrowsKeyword tk = new ThrowsKeyword();
            tk.m1();
    }
}
