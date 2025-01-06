package Day22.java;

public class StringImmutability4
{
    public static void main(String[] args) {
        String s1 = "  Ashish  ";
        s1.trim();
        System.out.println(s1);

        String s2 = "Janbask";
        s2   = s2.concat(" : Training School");

        System.out.println(s2);
    }
}
