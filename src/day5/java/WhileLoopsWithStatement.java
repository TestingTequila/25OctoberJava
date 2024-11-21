package day5.java;

public class WhileLoopsWithStatement
{
    public static void main(String[] args) {
        int i=1;
        while (i<=100)
        {
            if(i%5==0)
            {
                System.out.println("Hi");
            }
            else
            {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Infinite Printing");

//        while (true)
//        {
//            System.out.println("Welcome to Hilton Hotel");
//        }

        System.out.println("1-100 except 100");
        int j=1;
        while (j<=100)
        {
            if(j==50)
            {

            }
            else
            {
                System.out.println(j);
            }
            j++;
        }

        int score =0;
        while (score<=100)
        {
            if(score==25)
            {
                System.out.println("score is 25...yay..");
            }
            else if(score==50)
            {
                System.out.println("Half Century....");
            }
            else if(score==100)
            {
                System.out.println("Century");
            }

            score++;
        }

        System.out.println("==========Using Switch=================");
        int myScore=0;
        while (myScore<=100) {
            switch (myScore) {
                case 25:
                    System.out.println("score is 25...yay..");
                    break;
                case 50:
                    System.out.println("Half Century");
                    break;
                case 100:
                    System.out.println("Century");
                    break;
                default:
                    System.out.println(myScore);
                    break;
            }
            myScore++;
        }

    }

}
