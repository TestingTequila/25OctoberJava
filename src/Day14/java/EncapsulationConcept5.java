package Day14.java;

public class EncapsulationConcept5
{
    private  String name;
    private  int salary;

    public EncapsulationConcept5(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}