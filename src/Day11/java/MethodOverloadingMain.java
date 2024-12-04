package Day11.java;

public class MethodOverloadingMain
{
    public static void main(String[] args)
    {
        System.out.println("Default Main Method");
    }

    public static void main(String[] args, int a)
    {

    }

    public static void main(String[] args, String a)
    {

    }

    public static void main()
    {
        System.out.println(" Main Method without parameter");
    }
}
