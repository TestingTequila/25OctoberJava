package day5.java;

public class ForLoopsWithStatement
{
    public static void main(String[] args) {

        for (int i=1;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.println("Hi");
            }
            else
            {
                System.out.println(i);
            }

        }

        System.out.println("Infinite Printing");

//        while (true)
//        {
//            System.out.println("Welcome to Hilton Hotel");
//        }

        System.out.println("1-100 except 100");

        for (int j=1;j<=100;j++)
        {
            if(j==50)
            {

            }
            else
            {
                System.out.println(j);
            }

        }


        for (int score =0;score<=100; score++)
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


        }

        System.out.println("==========Using Switch=================");

        for (int myScore=0;myScore<=100;myScore++) {
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

        }

    }

}
