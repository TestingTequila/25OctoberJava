package Day18b.java;

public class TestHospital
{
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.cardioServices();//Inherited from USMA
        fh.neuroServices();//Inherited from USMA
        fh.physioServices();//Inherited from USMA
        fh.entServices();//Inherited from UKMA
        fh.dentalServices();//Inherited from UKMA
        fh.oncologyServices();//Inherited from IMA
        fh.gynicServices();//Inherited from IMA
        fh.orthoServices();//Inherited from IMA
        fh.medicalTrainingServices(); //This is from Fortis Hospital only
        fh.medicalInsuranceServices();//This is from Fortis Hospital only
        fh.emergencyServices(); //This is the common method inherited from all thr interfaces

        System.out.println("===============TOP CASTING===================");

        USMedicalAssociation usma= new FortisHospital();
        usma.cardioServices();
        usma.neuroServices();
        usma.physioServices();
        usma.physioServices();

        UKMedicalAssociation ukma =new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();
        ukma.emergencyServices();

       IndianMedicalAssociation ima  = new FortisHospital();
       ima.oncologyServices();
       ima.gynicServices();
       ima.orthoServices();
       ima.emergencyServices();

        System.out.println("==============Extending from Hospital Class========");
       fh.medicalRnD();
       fh.medicalNews();

        System.out.println("======WHO=================");
        fh.covidVaccination();

        System.out.println("======DOWN CASTING=================");

        //UHO uho = new UHO(); cannot create object of an interface
        //uho.childVaccinationProgram();
        // Cannot create constructor inside an interface because constructor helps in constructing the object and interface
        // objects can't be created
        //UHO.number =20; cannot override as variable in Interface is by final
        System.out.println(UHO.number); // Can call variable using interface name as variable within interface is static by default

        System.out.println("====Calling static method from Interface");
        UHO.taxCalculation();
        USMedicalAssociation.taxCalculation();
        // How can we call default method from an interface, with the help of class inheriting the interface
        fh.performanceReport();


    }
}
