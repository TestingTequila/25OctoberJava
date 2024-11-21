package day5.java;

public class WhileLoop
{
    public static void main(String[] args)
    {
        int i=1;
        while (i<=10)
        {
            System.out.println("Sheila");
            i++;
        }

        System.out.println("========Print the numbers from 1-10==========");

        int j=1;
        while (j<=10)
        {
            System.out.println(j);
            j++;
        }

        System.out.println("========Print the numbers from 10-1==========");

        int k=10;
        while (k>0)
        {
            System.out.println(k);
            k--;
        }

        System.out.println("========Table Of 2==========");

        int l =1;
        while (l<=10)
        {
            System.out.println(2*l);
            l++;
        }

        System.out.println("========Alternate way: Table Of 2==========");

        int m=2;
        while (m<=20)
        {
            System.out.println(m);//2, 4, 6.....20
            m = m+2;
        }


    }
}
