package Day14.java;

public class EncapsulationConcept4
{
    public void launchBrowser()
    {
        checkingInternalSecurity();
        calculateMemory();
        initializingDrivers();
        System.out.println("Launch Chrome Browser....");
    }

    private   void calculateMemory()
    {
        System.out.println("Calculating memory...");
    }

    private   void checkingInternalSecurity()
    {
        System.out.println("checking Internal Security...");
    }

    private   void initializingDrivers()
    {
        System.out.println("initializing Drivers");
    }
}
