package day8.java;

public class ExecutingEmployee
{
    public static void main(String[] args)
    {
        //1.
        Employee e1 = new Employee();
        e1.name ="Tom";
        e1.age=25;
        e1.city="LA";
        e1.salary=12.33;
        System.out.println(e1.name + ", " +e1.age + ", " + e1.city + ", " + e1.salary);

        //2.
        Employee e2 = new Employee();
        System.out.println(e2.name + ", " +e2.age + ", " + e2.city + ", " + e2.salary);

        //3.
        Employee e3 = new Employee();
        e3=null;// Null reference Object
        //e3.name ="Sheila";
        //System.out.println(e3.name); //NPE

        e3 = new Employee();
        e3.name= "Jason";
        System.out.println(e3.name);

        //4. Object Without Reference
        new Employee().name="Rita";
        new Employee().age=22;
        new Employee().city="NJ";
        new Employee().salary=445;

        System.gc();


    }
}
