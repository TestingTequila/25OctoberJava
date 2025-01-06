package Day22.java;

public class StringImmutability
{
    public static void main(String[] args) {

        String s = "SELENIUM";
        System.out.println(s.toLowerCase());// selenium
        System.out.println(s); // SELENIUM

        String t = "Cypress";
        System.out.println(t + " Script");
    }

}
