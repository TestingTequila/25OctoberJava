package day3.java;

public class SampleExample {
    public static void main(String[] args) {
        int m = 200;//m =199
        int n = m++; //n=200
        System.out.println(--m);//200
        System.out.println(m); //200
        System.out.println(m++);//200
        System.out.println(m--); //201
        System.out.println(--m); //199
        System.out.println(m); //199
    }
}
