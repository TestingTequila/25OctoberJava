package day2.java;

public class StringConcatenation {
    public static void main(String[] args) {

        String s1 = "Sheila";
        String s2 = "Ashish";
        int i1 = 100;
        int i2 = 200;

        System.out.println(s1 + s2 + i1);// SheilaAshish100
        System.out.println(s1 + s2 + i1 + i2);// SheilaAshish100200
        System.out.println(i1 + s1 + s2);//100SheilaAshish
        System.out.println(i1 + i2 + s1 + s2);//300SheilaAshish
        System.out.println(i1 + i2 + s1 + s2 + i1 + i2);//300SheilaAshish100200

        double d1 = 12.33;
        double d2 = 23.44;
        System.out.println(d1 + d2);

        System.out.println(d1 + d2 + s1 + s2);//35.77SheilaAshish
        System.out.println(s1 + s2 + d1 + d2); //SheilaAshish12.3323.44


        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1); //a
        System.out.println(c2); //b
        System.out.println(c1 + c2); // someNumber
        System.out.println(c1 + "" + c2); //ab

        System.out.println('a' + "Jason");
    }
}
