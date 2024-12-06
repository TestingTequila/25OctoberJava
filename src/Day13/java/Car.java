package Day13.java;

public class Car
{
    String name;//Audi
    String color;//Black
    int price;//24000
    boolean isAutomatic;//true

    public  Car(String name, String color, int price, boolean isAutomatic)
    {
            this.name = name;
            this.color =color;
            this.price=price;
            this.isAutomatic = isAutomatic;
    }

    public  Car(String name, String color)
    {
        this.name = name;
        this.color =color;
    }

    public  Car(String name, String color, int price)
    {
        this.name = name;
        this.color =color;
        this.price=price;
    }

    public  String getCarName()
    {
        if(name.equals("Audi"))
        {
            return name;
        }
        else
        {
            return "Invalid Car Name..";
        }

    }

    public  String getCarColor()
    {
        return color;
    }

    public  int getCarPrice()
    {
        return price;
    }

    public  boolean getCarAutomatic()
    {
        return isAutomatic;
    }
}
