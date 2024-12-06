package Day13.java;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        Employee emp = new Employee("Jason", "Roger", 28);
        System.out.println(emp.fName);
        System.out.println(emp.lName);
        System.out.println(emp.age);

        if(emp.getFName().equals("Jason"))
        {
            System.out.println("He is an employee of Microsoft...");
            if(emp.getAge()>=18)
            {
                System.out.println("He is eligible to stand for president election ");
            }
            else
            {
                System.out.println("Below 18...you can wait....");
            }
        }
        else
        {
            System.out.println("Not an employee of microsoft");
        }
    }

}
