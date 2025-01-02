package Day21.java;

import java.util.Arrays;

public class StringManipulation
{
    public static void main(String[] args) {
        String str = "Hi this is my Python code";
        System.out.println(str.length()); //23
        //li = 0
        //hi = length-1

        //1. charAt() ---> To know the character at any particular index
        //System.out.println(str.charAt(23)); //SIOBE

        //2. indexOf()

//        System.out.println(str.indexOf("java"));
//
//        if(str.indexOf("java")==14)
//        {
//            System.out.println("Yes..we are learning Java");
//        }
//        else
//        {
//            System.out.println("We are not learning Java...");
//        }

        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i', str.indexOf('i')+5));

        //toUpperCase()
        System.out.println(str.toUpperCase());
        //toLowerCase()
        System.out.println(str.toLowerCase());


        //trim()

        String str1 = "  Hello everyone, how are you  ";
        System.out.println(str1);
        System.out.println(str1.trim());

        //replace

        String str2 = "Happy New Year";
        System.out.println(str2.replace(" ", "").toUpperCase());

        String str3= "25-12-1994";
        System.out.println(str3.replace("-", "/"));
        System.out.println(str3.replace("1994", "2004"));

        String s1 = "My name is Anthony";
        String s2 = "My name is Anthony";
        String s3 = "my name is anthony";
        String s4 = "MY NAME IS ANTHONY";

        System.out.println(s1.equals(s2));//True
        System.out.println(s1.equals(s3));//False
        System.out.println(s2.equals(s3));//False
        System.out.println(s3.equals(s4.toLowerCase())); //True

        //contains
        System.out.println(s3.contains("Anthony")); //false

        //Split()

        String programmingLanguages = "JAVA_C#_PYTHON_RUBY_C++_JAVASCRIPT";
        //System.out.println(programmingLanguages.indexOf("#"));
        String [] myProgram=programmingLanguages.split("_");
        System.out.println(Arrays.toString(myProgram));

        String ss [] = str.split(" ");
        System.out.println(Arrays.toString(ss));
        System.out.println(ss.length);


//        System.out.println(myProgram[3]);

    }




}


