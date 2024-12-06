package Day13.java;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "Black", 24000, true);
        System.out.println(c1.getCarName());//Audi
        System.out.println(c1.getCarColor());//Black
        System.out.println(c1.getCarPrice());//24000
        System.out.println(c1.getCarAutomatic());//true
    }
}
