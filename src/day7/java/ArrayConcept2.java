package day7.java;

import java.util.Arrays;

public class ArrayConcept2 {
    public static void main(String[] args) {
        //1. DataType[] arrayName = {value1, value2, value3........};// We can use this when we know  the exact value that is to be stored
        int[] number1 = {12, 45, 56, 67, 87, 89};

//        for (int i = 0; i < number1.length; i++) {
//            System.out.println(number1[i]);
//        }

        System.out.println(Arrays.toString(number1));
        System.out.println("=======================================");

        //2. DataType[] arrayName = new dataType[countOfValuesToBeStored];
        int[] number2 = new int[6];
        number2[0]=100;
        number2[3]=450;
        number2[2]=60;
        number2[6]=420;
        for (int n : number2) {
            System.out.println(n);
        }
    }
}


// Limitations of Arrays:
   //Static Array: Length of the array is fixed, this can always hold fixed values
   // Collections