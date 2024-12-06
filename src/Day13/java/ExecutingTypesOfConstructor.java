package Day13.java;

import java.util.spi.ToolProvider;

public class ExecutingTypesOfConstructor
{
    public static void main(String[] args) {
        TypesOfConstructor toc = new TypesOfConstructor();
        System.out.println(toc.a);//1000
        System.out.println(toc.b);//2000
        System.out.println(toc.s);//Ashish

        System.out.println("=============Assign Value============");
        toc.a =100;
        toc.b =200;
        toc.s = "Sheila";
        System.out.println(toc.a);//100
        System.out.println(toc.b);//200
        System.out.println(toc.s);//Sheila

        System.out.println("================Constructor Calling=============");

        TypesOfConstructor toc0 = new TypesOfConstructor();// constructor without parameter
        TypesOfConstructor toc1 = new TypesOfConstructor(12, 3); //constructor with 2 integer parameters
        TypesOfConstructor toc2= new TypesOfConstructor(12, "Jason"); // Constructor with one int and one String parameter
        TypesOfConstructor toc3 = new TypesOfConstructor(12, 8, "Roger"); //Constructor with 2 integer and one string
    }
}
