package Day11.java;

public class ExecutingCar2
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="BMW";
        c1.price=90;
        c1.color="Red";
        System.out.println("CAR NAME: " + c1.name + ", PRICE: " + c1.price + ", COLOR: " + c1.color +", WHEELS: " + Car.wheels);

        Car c2= new Car();
        c2.name = "Audi";
        c2.price=80;
        c2.color ="White";
        System.out.println("CAR NAME: " + c2.name + ", PRICE: " + c2.price + ", COLOR: " + c2.color +", WHEELS: " + Car.wheels);

        Car c3 = new Car();
        c3.name = "AlphaRomeo";
        c3.price =50;
        c3.color = "Black";
        System.out.println("CAR NAME: " + c3.name + ", PRICE: " + c3.price + ", COLOR: " + c3.color +", WHEELS: " + Car.wheels);


    }
}
