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

        System.out.println("======DOWN CASTING=================");


    }
}
