package day5.java;

public class ForLoop
{
    public static void main(String[] args)
    {

        for (int i=1;i<=10;i++)
        {
            System.out.println("Sheila");
        }

        System.out.println("========Print the numbers from 1-10==========");


        for (int j=1;j<=10;j++)
        {
            System.out.println(j);
        }

        System.out.println("========Print the numbers from 10-1==========");


        for (int k=10;k>0;k--)
        {
            System.out.println(k);
        }

        System.out.println("========Table Of 2==========");


        for (int l =1;l<=10;l++)
        {
            System.out.println(2*l);
        }

        System.out.println("========Alternate way: Table Of 2==========");


        for (int m=2;m<=20;m = m+2)
        {
            System.out.println(m);
        }


    }
}
