package Day17.java;

public class BMW extends Car
{
    public  void autoParking()
    {
        System.out.println("BMW----auto-parking");
    }

    @Override
    public  void start()
    {
        System.out.println("BWM ----start");
    }


    //Method overriding is also known as runtime/Dynamic Polymorphism

}
