package Day16.java;

public class Employee
{
    String name;
    int age;

    public int addition(int a, int b)
    {
        int sum =a+b;
        return sum;
    }

    public  void getInfo(Employee emp)
    {
        emp.name = "Jason";
        emp.age =27;
    }
}
