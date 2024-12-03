package day10.java;

public class PrintMarks
{
    public  int displayMarks(String studentName)
    {
        int marks=0;
        if(studentName.equals("Ashish"))
        {
            marks= 98;
        }
        else if (studentName.equals("Sheila"))
        {
            marks= 100;
        }
        else if (studentName.equals("Jason"))
        {
            marks= 88;
        }
        else if (studentName.equals("Roger"))
        {
            marks= 54;
        }
        else
        {
            marks= -1;
        }
        return  marks;
    }
}
