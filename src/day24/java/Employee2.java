package day24.java;

public class Employee2
{
    String name;
    public static void main(String[] args) {
        try {
            int x = 9 / 3; //AE
            Employee emp = new Employee();
            emp =null;
            emp.name = "Justin"; //NPE
        }

        finally {
            System.out.println("I will Always Execute....");
        }
        System.out.println(" Print this statement ");

        System.out.println("Will this be printed....");

    }
}
