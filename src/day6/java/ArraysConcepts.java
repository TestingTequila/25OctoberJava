package day6.java;

public class ArraysConcepts {
    public static void main(String[] args) {

        //dataType[] arrayName = {value1, value2....value3..};
        //12,45,67,7, 4,78
//        int x = 10;
//        System.out.println(x);//10

        int[] numbers = {12, 45, 67, 7, 4, 78, 100, 87, 54, 65, 32};
//        System.out.println(numbers[1]);//45
//        System.out.println(numbers.length);//11
        //Loops
        System.out.println("===========WHILE=======================");
        int i = 0;
        while (i < numbers.length) {
            if(numbers[i]==100)
            {

            }
            else {
                System.out.println(numbers[i]);//12, 45,67........65, 32
            }
            i++;
        }

        System.out.println("================FOR====================");
        for (int i1 = 0; i1 < numbers.length; i1++) {
            if(numbers[i1]==100)
            {

            }
            else {
                System.out.println(numbers[i1]);//12, 45,67........65, 32
            }

        }

        System.out.println("================ADVANCE FOR============");
        for (int n : numbers) {
            if(n==100)
            {

            }
            else {
                System.out.println(n);
            }
        }


        //Jason, Ashish, Sheila, Ben, Lee, Kerrie

        String[] names = {"Jason", "Ashish", "Sheila", "Ben", "Lee", "Kerrie"};

        System.out.println("=====WHILE LOOP====================");
        int j = 0;
        while (j < names.length) {

            switch (names[j])
            {
                case "Jason":
                    System.out.println("He is a Doctor");
                    break;
                case "Ashish":
                    System.out.println("He is a corporate Trainer");
                    break;
                case "Sheila":
                    System.out.println("She is a student");
                    break;
                case "Ben":
                    System.out.println("He is a Plumber");
                    break;
                case"Lee":
                    System.out.println("He is a Project Manager");
                    break;
                case"Kerrie":
                    System.out.println("She is a Model");
                    break;
                default:
                    System.out.println("No name Found....");
            }

            System.out.println(names[j]);
            j++;
        }

        System.out.println("=====FOR LOOP====================");

        for (int k = 0; k < names.length; k++) {
            System.out.println(names[k]);

        }

        System.out.println("=====ADVANCED FOR LOOP====================");
        for(String s: names)
        {
            System.out.println(s);
        }

//        System.out.println(names[4]);
//        //li = 0;
//        System.out.println(names.length);// 6
//        //hi= 5

        //a, e,i,o,u
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(vowels[0]);//a
        System.out.println(vowels.length);//5
        //li=0;
        //hi=4
        // Print vowels using while loop/for loop and advanced for loop

    }
}
