package Day13.java;

public class ExecutingConstructors
{
    public static void main(String[] args) {
        ConstructorsConcept cc = new ConstructorsConcept();
        cc.a = 100;
        cc.str = "Ashish";
        System.out.println(cc.a);//100
        System.out.println(cc.b);//20
        System.out.println(cc.str);//Ashish
        System.out.println(cc.a++);//100
        System.out.println(cc.a);//101

    }
}
