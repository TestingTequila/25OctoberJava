package Day13.java;

public class Employee
{
    String fName;//Jason
    String lName;//Roger
    int age;//28

    public  Employee(String fName,String lName, int age )
    {
               this.fName = fName;
               this.lName =lName;
               this.age =age;
    }

    public  String getFName()
    {
        return fName;
    }

    public  String getLName()
    {
        return lName;
    }

    public  int getAge()
    {
        return age;
    }


}
