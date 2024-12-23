package Day18.java;

public class Car extends Vehicle
{
    final int wheels =4; // final keyword with variable, this value cannot be overridden
    public  void start()
    {
        System.out.println("Car ----start");
    }

    public  void stop()
    {
        System.out.println("Car ----stop");
    }

    public  void refuel()
    {
        System.out.println("Car ----refuel");
    }

    public final void sunroof()
    {
        System.out.println("Car ---sunroof");
    }

    public static void billing()
    {
        System.out.println("Car-----billing");
    }

    public static void billing(int x)
    {
        System.out.println("Car-----billing");
    }

    public  void payment(int cash)
    {
        System.out.println("Car----Payment using " + cash);
    }
    public  void payment(int cash, int bitcoin )
    {
        System.out.println("Car----Payment using " + cash + " and Crypto " + bitcoin);
    }

    @Override
    public void engine()
    {
        System.out.println("Car -----engine");
    }
}
