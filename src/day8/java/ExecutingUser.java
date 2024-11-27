package day8.java;

public class ExecutingUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Ravi";
        u1.age = 25;
        u1.city = "Pune";

        User u2 = new User();
        u2.name = "Sheila";
        u2.age = 30;
        u2.city = "LA";

        User u3 = new User();
        u3.name = "Kareem";
        u3.age = 30;
        u3.city = "NJ";

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Ravi
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); // Sheila
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); // Kareem

        System.out.println("=================(u1=u2)======================");
        u1=u2; //u1 will break its original connection and start pointing where u2 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Sheila
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); // Sheila
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); // Kareem

        System.out.println("=================(u2=u3)======================");
        u2=u3;//u2 will break its original connection and start pointing where u3 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); // Sheila
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); // Kareem
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); // Kareem

        System.out.println("=================(u3=u1)======================");
        u3=u1;//u3 will break its original connection and start pointing where u1 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); // Sheila
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); // Kareem
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); // Sheila

        System.out.println("=================(u3=u1)======================");
        u2=u1;//u2 will break its original connection and start pointing where u1 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); // Sheila
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); // Sheila
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); // Sheila

        System.out.println("=================(u1 updated the name)======================");
        u1.name = "Roza";
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); // Roza
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); // Roza
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); // Roza


    }
}
