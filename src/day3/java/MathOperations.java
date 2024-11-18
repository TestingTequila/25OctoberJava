package day3.java;

public class MathOperations {

    public static void main(String[] args) {

        //1. I/I = I

        System.out.println(10/2); //5
        System.out.println(10/3); //3

        //2. I/D = ? || D/I = D
        System.out.println(10/2.0); //5.0
        System.out.println(10.0/2); //5.0
        System.out.println(10/3.0); //3.3333333333333335

        //3. I/0 = AE
        //System.out.println(10/0); //AE

        //4. ID/0.0 =Infinity
        System.out.println(10/0.0);

        //5. Modulo Operator(%) - Remainder
        System.out.println(10%2); //0
        System.out.println(10%3); //1
        System.out.println(10.0%3);//1.0
        System.out.println(10.0%3.3);//0.10000000000000053





    }
}
