package Day18b.java;

public class FortisHospital extends Hospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation
{

    @Override
    public void cardioServices() {
        System.out.println("Fortis------cardioServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("Fortis------neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("Fortis------physioServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("Fortis------emergencyServices");
    }

    @Override
    public void entServices() {
        System.out.println("Fortis------entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("Fortis------dentalServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("Fortis------oncologyServices");
    }

    @Override
    public void gynicServices() {
        System.out.println("Fortis------gynicServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("Fortis------orthoServices");
    }

    public  void medicalTrainingServices()
    {
        System.out.println("Fortis------medicalTrainingServices");
    }

    public  void medicalInsuranceServices()
    {
        System.out.println("Fortis------medicalInsuranceServices");
    }

    @Override
    public void covidVaccination() {
        System.out.println("Fortis---covidVaccination");
    }

    @Override
    public void childVaccinationProgram() {
        System.out.println("Fortis----childVaccinationProgram");
    }

    @Override
    public void performanceReport()
    {
        System.out.println("Fortis---performanceReport");
    }
}
