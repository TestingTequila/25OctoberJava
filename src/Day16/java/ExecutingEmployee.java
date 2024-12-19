package Day16.java;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.name + " : " + e1.age);

        e1.getInfo(e1);

        System.out.println(e1.name + " : " + e1.age);

        Employee e2 = new Employee();
        e2.name = "Ashish";
        e2.age =30;
        System.out.println(e2.name + e2.age);

        e2.getInfo(e1);
        System.out.println(e2.name + e2.age);



    }
}
