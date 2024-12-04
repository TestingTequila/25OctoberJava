package Day11.java;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="BMW";
        c1.price=90;
        c1.color="Red";
        c1.wheels=4;
        System.out.println("CAR NAME: " + c1.name + ", PRICE: " + c1.price + ", COLOR: " + c1.color +", WHEELS: " + c1.wheels);

        Car c2= new Car();
        c2.name = "Audi";
        c2.price=80;
        c2.color ="White";
        c2.wheels=4;
        System.out.println("CAR NAME: " + c2.name + ", PRICE: " + c2.price + ", COLOR: " + c2.color +", WHEELS: " + c2.wheels);

        Car c3 = new Car();
        c3.name = "AlphaRomeo";
        c3.price =50;
        c3.color = "Black";
        c3.wheels=4;
        System.out.println("CAR NAME: " + c3.name + ", PRICE: " + c3.price + ", COLOR: " + c3.color +", WHEELS: " + c3.wheels);


    }
}
