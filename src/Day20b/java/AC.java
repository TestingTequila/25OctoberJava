package Day20b.java;

public abstract class AC {

    public  AC()
    {
        x= 10;
        name = "Jason";
    }
    int x;
    String name;
    public abstract void m1();
    public  void m2()
    {
        System.out.println("Concrete Method from AC class");
    }
}
