package day4.java;

public class SwitchWIthOrOperator {

    public static void main(String[] args) {
        String day = "Saturday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Its Weekday");
                break;
            default:
                System.out.println("Its Weekend");
                break;

        }
    }
}
