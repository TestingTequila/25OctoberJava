package Day11.java;

public class Car
{
    String name;
    int price;
    String color;
    static int wheels=4; // Common Property value

    public void start()
    {
        System.out.println("Car ----start");
    }

    public static String speedTest()
    {
        return "Car ----speed Test";
    }


}
