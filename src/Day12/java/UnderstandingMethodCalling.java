package Day12.java;

public class UnderstandingMethodCalling
{

    public  void nonStaticMethod1()
    {
        System.out.println("nonStaticMethod1");
        nonStaticMethod2();
        UnderstandingMethodCalling umc = new UnderstandingMethodCalling();
        umc.nonStaticMethod2();
        UnderstandingMethodCalling.staticMethod1();
        UnderstandingMethodCalling.staticMethod2();
    }

    public  void nonStaticMethod2()
    {
        System.out.println("nonStaticMethod2");
        nonStaticMethod1();
        UnderstandingMethodCalling umc1 = new UnderstandingMethodCalling();
        umc1.nonStaticMethod1();
    }

    public  static  void staticMethod1()
    {
        System.out.println("staticMethod1");
        UnderstandingMethodCalling.staticMethod2();//Calling through Class Name as they are static
        staticMethod2();
    }

    public  static  void staticMethod2()
    {
        System.out.println("staticMethod2");
        UnderstandingMethodCalling.staticMethod1();//Calling through Class Name as they are static
        staticMethod1();
        UnderstandingMethodCalling ums= new UnderstandingMethodCalling();
        ums.nonStaticMethod1();
        ums.nonStaticMethod2();
    }
}
