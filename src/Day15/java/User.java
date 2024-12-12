package Day15.java;

public class User
{
    String name; //Jason
    int age; //22
    String city; //NJ
    double salary;

    public User(String name, int age, String city) //Rahul, 33, Toronto
    {
         this("Ohio");
         this.name = "Jason";
         this.city ="NJ";
         this.age=22;
    }

    public  User(String city) //Ohio
    {
        this("Hyden", 18);
        this.city = city;
    }

    public  User(String city, int age) //London, 45
    {
        this.city = city;
        this.age=age;
    }
}
