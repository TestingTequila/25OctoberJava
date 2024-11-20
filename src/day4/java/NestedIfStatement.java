package day4.java;

public class NestedIfStatement
{
    public static void main(String[] args) {
        int age = 25;
        boolean haveId = true;
        boolean postOnSocialMedia = true;
        if(age>=18)
        {
            System.out.println("You are eligible to Vote....");
            if(haveId)
            {
                System.out.println("You can vote today...");
                if(postOnSocialMedia)
                {
                    System.out.println("You can post on social media");
                }
            }
        }
    }
}
