package day10.java;

public class ReturnTypeExecution {
    public static void main(String[] args) {
        ReturnTypeConcept rtc = new ReturnTypeConcept();
        //int total = rtc.addition1(12, 8); //void

        int total1 = rtc.addition2(12, 8); //int
        System.out.println(total1*5);

        boolean myResponse = rtc.isMarried();//boolean
        char c1 = rtc.getChar(); //char
        System.out.println(c1);
        System.out.println((int)c1);
    }
}
