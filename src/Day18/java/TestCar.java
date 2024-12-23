package Day18.java;

public class TestCar
{
    public static void main(String[] args)
    {
        BMW bmw = new BMW();
        bmw.start();// inherited and overridden
        bmw.stop(); // inherited
        bmw.refuel(); //inherited
        bmw.autoParking();// method from BMW class
        bmw.automatic(); //inherited


        //Top Casting [ParentClass refVar = new ChildClass()]
        System.out.println("======TOP Casting==========");
        Car c1 =new BMW();
        c1.automatic();
        c1.start();
        c1.stop();
        c1.refuel();
        BMW.billing();
        c1.sunroof();

       Vehicle v1 = new Car();
       v1.automatic();

       Vehicle v2 =new BMW();
       v2.automatic();


       // Down Casting is not allowed in Java

        BMW b1 =(BMW)new Car(); //At compile time its possible
        // but will give 'ClassCastException' on Run Time
    }
}
