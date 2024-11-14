package day2.java;

public class VariableConcept {
    public static void main(String[] args) {

        //char data Type[2 bytes = 16 bits]
        //[a to z]/[A to Z]/[1 to 9]

        char c1 = 'a'; //97
        char c2 = 'z'; //122
        System.out.println(c1 + c2);
        System.out.println((int) c2);

        char c3 = 'A'; //65
        char c4 = 'Z'; //90
        System.out.println(c3 + c4);

        char c5 = '1'; //49
        char c6 = '$'; //36
        System.out.println(c5 + c6); //85

        System.out.println((int) 'A');

        char c7 = '5';

        System.out.println((int) c7);

        System.out.println("===============================================");

        char u1 = 'a';
        System.out.println(u1); //a
        System.out.println((int) u1); //97
        System.out.println(u1 + 0); //97
        System.out.println(u1 + '0');//97+ 48 = 145

        char h1 = '#';
        System.out.println(h1); //#
        System.out.println((int) h1); //35
        System.out.println(h1 + 3); //38
        System.out.println(h1 + '3'); //86

        //boolean data type
        //MEMORY: ~1 bit
        //Range: true/false

        boolean b1 = true;
        boolean b2 = false;


    }
}
