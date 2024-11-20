package day4.java;

public class _MultipleElseIfStatement
{
    public static void main(String[] args) {
        int number =15;
        if(number>20)
        {
            System.out.println("Number is greater than 20");
        }
        else if(number>5 && number<=10)
        {
            System.out.println("Number is greater than 5 but less than 10");
        }
        else if(number<=5)
        {
            System.out.println("Number is 5 or less");
        }
        else if(number>10 && number<=20)
        {
            System.out.println("Number is greater than 10 but less than 20");
        }
        else
        {
            System.out.println("Please check the number....");
        }
    }
    }

