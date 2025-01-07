package Day23.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IssuesInArray
{
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 7 ,89, 80};

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("====== Blank Array list======");

        for(int num: numbers)
        {
            list.add(num);
        }

        System.out.println("====== Filled Array list======");
        System.out.println(list);


//        int[] age = new int[10];

//        System.out.println(numbers[6]);

//        System.out.println("=====WHILE LOOP=======");
//        int i = 0;
//        while ( i <numbers.length)
//        {
//            System.out.println(numbers[i]);
//            i++;
//        }

//        System.out.println("=====FOR LOOP=======");
//        for(int i1 = 0; i1 <numbers.length; i1++)
//        {
//            System.out.println(numbers[i1]);
//        }
//
//        System.out.println("=====ADVANCED FOR LOOP=======");
//        for(int num: numbers)
//        {
//            System.out.println(num);
//        }
//
//        System.out.println("======IN BUILD FUNCTIONS");
//        System.out.println(Arrays.toString(numbers));

    }
}
