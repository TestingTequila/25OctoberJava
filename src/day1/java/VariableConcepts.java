package day1.java;

public class VariableConcepts {
    public static void main(String[] args) {

        //byte, short, int, long, float, double, char, boolean

        //dataType variableName = variableValue;

        //INTEGER FAMILY
        byte num1 = -128;
        //MEMORY: 1 byte = 8 bits
        //RANGE:  -128 to 127

        short num2 = 32767;
        //MEMORY: 2 bytes = 16 bits
        //RANGE : -32768 to 32767

        int num3 = 2147483647;
        //MEMORY:  4 bytes = 32 bits
        //RANGE : -2147483648 to 2147483647

        long num4 = 2147483648l;
        //MEMORY:  8 bytes = 64 bits
        //RANGE : -9223372036854775808 to 9223372036854775807

        //================================================================

        int x = 10;
        int y = 20;
        int sum = x + y;
        //================================================================

        //Floating-Point
        //float

        //MEMORY: 4 bytes
        //RANGE : 7 decimal places
        float f1= (float) 12.335464756546456546;
        float f2= 12.3378677655465446f;
        System.out.println(f1);
        System.out.println(f2);

        System.out.println("=======================================================");
        //double
        //MEMORY: 8 bytes
        //RANGE : 16 decimal places
        double f11= 12.335464756546456546;
        double f22= 12.3378677655465446;
        System.out.println(f11);
        System.out.println(f22);

    }

}


