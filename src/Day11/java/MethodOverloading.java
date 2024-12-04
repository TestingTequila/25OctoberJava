package Day11.java;

public class MethodOverloading
{
    public  void addition(int a, int b)// addition, int, int
    {
        System.out.println("int"+ "int");
    }

    public  void addition(double c, int d)// addition, double, int
    {
        System.out.println("double"+ "int");
    }

    public  void addition(double c, double d)// addition, double, double
    {
        System.out.println("double"+ "double");
    }

    public  void addition(double c, float d)// addition, double, float
    {
        System.out.println("double"+ "float");
    }

    public  void addition(float c, double d)// addition, float, double
    {
        System.out.println("float"+ "float");
    }

    public  void addition(float c, double d, int e)// addition, float, double
    {
        System.out.println("float"+ "double" + "int");
    }
    public  double addition(float c, double d, char e)// addition, float, double
    {
        System.out.println("float"+ "double" + "int");
        return d;
    }
}
