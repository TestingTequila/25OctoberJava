package Day12.java;

public class ExecutingTest
{
    public static void main(String[] args) {
        Test a1 = new Test();
        Test a2 = new Test();

        System.out.println(a1.a++);
        System.out.println(a1.b++);
        System.out.println(a2.a++);
        System.out.println(a2.b++);

        System.out.println("===========");
        System.out.println(a1.b);
        System.out.println(a2.b);
        System.out.println(a1.a);
        System.out.println(a2.a);
    }
}
