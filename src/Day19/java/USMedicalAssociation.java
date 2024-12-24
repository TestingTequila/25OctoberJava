package Day19.java;

public interface USMedicalAssociation extends  WHO
{
    public void cardioServices();
    public void neuroServices();
    public void physioServices();
    public void emergencyServices();
    public static void taxCalculation()
    {
        System.out.println("USMedicalAssociation---taxCalculation");
    }
}
