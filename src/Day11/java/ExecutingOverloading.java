package Day11.java;

public class ExecutingOverloading
{
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.addition(12.33, 34.55f);
        mo.addition(12,12);
        mo.addition(12.33,12);
        mo.addition(12.34, 56.78f);

        RealTimeMethodOverloadingExamples rte = new RealTimeMethodOverloadingExamples();
        rte.search(123);
        rte.search("Samsung");
    }
}
