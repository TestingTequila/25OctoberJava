package Day12.java;

public class ExecutingCar3
{
    public static void main(String[] args) {
        //ExecutingCar3.speedTest();// can call using Class Name
        speedTest(); //Can call directly also since both are part of CMA only

    }

    public void start()
    {
        System.out.println("Car ---start");
    }
    public static void speedTest()
    {
        System.out.println("Car---speed Test");
    }
}
