package day7.java;

public class ExecutingResume {
    public static void main(String[] args) {

        // ClassNameWhoseObjectWeWantToCreate aliasName = new ClassNameWhoseObjectWeWantToCreate();
        Resume sheilaResume = new Resume();
        sheilaResume.firstName = "Sheila";
        sheilaResume.lastName = "Morris";
        sheilaResume.gender = 'F';
        sheilaResume.totalExperience = 10;
        sheilaResume.isMarried = true;

        System.out.println(sheilaResume.firstName + " " + sheilaResume.lastName + ", " + sheilaResume.gender + ", " + sheilaResume.totalExperience + ", " + sheilaResume.isMarried);

        Resume ashishResume = new Resume();
        ashishResume.firstName = "Ashish";
        ashishResume.lastName = "Mishra";
        ashishResume.gender = 'M';
        ashishResume.totalExperience = 15;
        ashishResume.isMarried = false;

        System.out.println(ashishResume.firstName + " " + ashishResume.lastName + ", " + ashishResume.gender + ", " + ashishResume.totalExperience + ", " + ashishResume.isMarried);


        Resume johnResume = new Resume();
        johnResume.firstName = "John";
        johnResume.lastName = "Fletcher";
        johnResume.gender = 'M';
        johnResume.totalExperience = 5;
        johnResume.isMarried = true;

        System.out.println(johnResume.firstName + " " + johnResume.lastName + ", " + johnResume.gender + ", " + johnResume.totalExperience + ", " + johnResume.isMarried);

    }
}
