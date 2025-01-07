package day24.java;

import java.io.IOException;
import java.sql.SQLException;

public class Employee
{
    String name;
    public static void main(String[] args) {
//        try {
//            int x = 9 / 0; //AE
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println(" Print this statement ");

        Employee emp = new Employee();
        emp=null;
        try {
            emp.name = "Justin";

        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        System.out.println("Will this be printed....");

    }
}
