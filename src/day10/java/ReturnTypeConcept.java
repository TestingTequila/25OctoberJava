package day10.java;

public class ReturnTypeConcept
{
    public void addition1(int a, int b) //Method without returnType and with Parameters
    {
        int sum =a+b;
        System.out.println(sum);
    }

    public int addition2(int a, int b) //Method with returnType and with Parameters
    {
        int sum =a+b;
        System.out.println(sum);
        return sum;
    }

    public boolean isMarried()
    {
        return true;
    }

    char[] vowels = {'a', 'e', 'i' ,'o' ,'u'};
    public  char getChar()
    {
        for(char c: vowels)
        {
            if(c=='u')
            {
                return c;
            }
            else
            {
                return 'a';
            }
        }
        return 0;
    }
}
