package Day22.java;

public class StringImmutability3
{
    public static void main(String[] args) {

        String s1 = new String("Test");// 2 objects
        String s2 = new String("Test");// 1 object
        System.out.println(s1==s2); // Compares the objects --> False
        System.out.println(s1.equals(s2)); // Compares the value ---> True

        String s3 = "Test";
        System.out.println(s3==s1); // False
        System.out.println(s3==s2); // False
        System.out.println(s3.equals(s1)); // True
        System.out.println(s3.equals(s2)); // True

        s1=s2;
        System.out.println(s1==s2); // True
        System.out.println(s1.equals(s2)); //True

        s2= s3;
        System.out.println(s2==s3); //True
        System.out.println(s2.equals(s3));//True

        System.out.println(s1==s2); //False
        System.out.println(s1.equals(s2));//True

        s1=s2=s3;

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);


        System.out.println(s3 + "Automation");

    }

}
