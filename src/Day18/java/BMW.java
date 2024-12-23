package Day18.java;

public class BMW extends Car {
    public void autoParking() {
        System.out.println("BMW----auto-parking");
    }

    @Override
    public void start() {
        System.out.println("BWM ----start");
    }

    public static void billing() {
        System.out.println("BMW-----billing");
    }


    @Override
    public void payment(int cash) {
        System.out.println("BMW----Payment using " + cash);
    }

    @Override
    public void payment(int cash, int bitcoin) {
        System.out.println("BMW----Payment using " + cash + " and Crypto " + bitcoin);
    }

    public void payment(int cash, int bitcoin, String name) {
        System.out.println("BMW----Payment using " + cash + " and Crypto " + bitcoin);
    }

    @Override
    public void engine()
    {
        System.out.println("BMW -----engine");
    }

    //Method overriding is also known as runtime/Dynamic Polymorphism
    //method/s with 'final' keyword cannot be overridden
    //method/s with static keyword cannot be overridden
    //We can override an overloaded method
    // We overload an overridden method


}
