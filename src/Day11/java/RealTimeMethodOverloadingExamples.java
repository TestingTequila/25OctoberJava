package Day11.java;

public class RealTimeMethodOverloadingExamples
{
    public void search(String brand)
    {

    }

    public void search(int price)
    {

    }

    public void search(int price, String condition)
    {

    }

    public void search(String brand, double price)
    {

    }

    public  void search(float displaySize)
    {

    }

    public  void search(String os, String pt)
    {

    }

    public  void login(String un, String pw)
    {

    }

    public  void login(String un, String pw, int otp)
    {

    }

    public  void login(String fb)
    {

    }

    public  void move(String topKey)
    {
        System.out.println("Hero will Fire");
    }

    public  void move(String topKey, String leftKey)
    {
        System.out.println("Hero will Jump and Fire");
    }

    public  void makePayment(String cc)
    {

    }

    public  void makePayment(String cc, String otp)
    {

    }

}
