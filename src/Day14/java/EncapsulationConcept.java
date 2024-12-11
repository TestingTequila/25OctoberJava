package Day14.java;

public class EncapsulationConcept
{
    private String name;
    private int salary;

    public  void setName(String name)
    {
           if (name.equals("Kerrie"))
           {
               this.name = name;
           }
           else
           {
               System.out.println(" Not an Employee of this company");
           }

    }

    public String getName()
    {
        return name;
    }

    public void setSalary(int salary)
    {
        if(salary<=1000 || salary >=15000)
        {
            System.out.println("Please check the salary...");
        }
        else {
            this.salary = salary;
        }
    }

    public int getSalary()
    {
        return salary;
    }
    public void calculateSalary()
    {
        System.out.println("The salary of the Employee: "+ getName() + " is $" + getSalary() );
    }
}


