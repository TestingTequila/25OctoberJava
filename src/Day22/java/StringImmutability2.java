package Day22.java;

public class StringImmutability2
{
    public static void main(String[] args) {


        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1==s2); //False
        System.out.println(s1.equals(s2)); //True

        String s3 = "Java";

        System.out.println(s1==s3); // True
        System.out.println(s1.equals(s3));//True

        String s4 = new String("Java");

        System.out.println(s2==s4); // False
        System.out.println(s2.equals(s4)); // True

        System.out.println(s3==s4); //False
        System.out.println(s3.equals(s4)); //True

        s3=s4;
        System.out.println(s3==s4); //True
        System.out.println(s3.equals(s4)); //True




    }

}
