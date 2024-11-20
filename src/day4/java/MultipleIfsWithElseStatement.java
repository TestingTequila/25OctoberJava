package day4.java;

public class MultipleIfsWithElseStatement
{
    public static void main(String[] args) {
        int number =15;
        if(number>20)
        {
            System.out.println("Number is greater than 20");
        }
        if(number>10 && number<=20)
        {
            System.out.println("Number is greater than 10 but less than 20");
        }
        if(number>5 && number<=10)
        {
            System.out.println("Number is greater than 5 but less than 10");
        }
        if(number<=5)
        {
            System.out.println("Number is 5 or less");
        }
        else
        {
            System.out.println("Please check the number....");
        }
    }
}
