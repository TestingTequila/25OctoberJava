package Day12.java;

public class HandlingStaticAndNonStaticMethod
{
    boolean staticMethod=true;
    public  void handlingMethods()
    {
        if(staticMethod)
        {
            System.out.println("Call it through class Name");
        }
        else
        {
            System.out.println("Call it through Object");
        }
    }
}
