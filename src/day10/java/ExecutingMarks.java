package day10.java;

public class ExecutingMarks
{
    public static void main(String[] args) {
        PrintMarks pm = new PrintMarks();
        int myMarks =pm.displayMarks("Sheila");
        if(myMarks>90 && myMarks<=100 )
        {
            System.out.println("Outstanding.....");
        }
        System.out.println("Student has scored " + myMarks + " marks");
    }
}
