package Day14.java;

public class EncapsulationConcept2
{

    private String name;
    private int salary;

    public EncapsulationConcept2(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        if(this.name.equals("Kerrie"))
        {
            return name;
        }
        else
        {
            return null;
        }
    }

    public int getSalary()
    {
        if(this.salary<=1000 || this.salary >=15000)
        {
            return 0;
        }
        else {
            return salary;
        }
    }
    public void calculateSalary()
    {
        System.out.println("The salary of the Employee: "+ getName()+ " is $" + getSalary() );
    }
}


