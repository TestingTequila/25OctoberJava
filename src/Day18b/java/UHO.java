package Day18b.java;

public interface UHO
{
    public void childVaccinationProgram();
    int number =10; // variable  within interface will always be static and final

    public static void taxCalculation()
    {
        System.out.println("UHO---taxCalculation");
    }
    default void performanceReport()
    {
        System.out.println("WHO---performanceReport");
    }
}
