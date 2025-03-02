package day3.java;

public class PostIncrementDecrementOperators {
    public static void main(String[] args) {

        //1. post increment++ [increment after assigning]
        int a = 1;
        int b = a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int c =100;
        int d= c++;
        System.out.println(c); // 101
        System.out.println(d); // 100

        int x=-99;
        int y =x++;
        System.out.println(x);
        System.out.println(y);

        //1. post decrement-- [decrement after assigning]
        int a1 = 1;
        int b1 = a1--;
        System.out.println(a1);//0
        System.out.println(b1);//1

        int c1 =100;
        int d1= c1--;
        System.out.println(c1); // 99
        System.out.println(d1); // 100

        int x1=-99;
        int y1 =x1--;
        System.out.println(x1);// -100
        System.out.println(y1);//-99




    }
}
