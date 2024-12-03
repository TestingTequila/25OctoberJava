package day10.java;

public class ExecutingSalary
{
    public static void main(String[] args) {
        CalculateSalary cs = new CalculateSalary();
        int salary =cs.salary(12000, 8000); //20000
        System.out.println("Salary Without Bonus: " + salary);
        System.out.println("Salary With Bonus: "+(salary+cs.christmasBonus()));
    }
}
