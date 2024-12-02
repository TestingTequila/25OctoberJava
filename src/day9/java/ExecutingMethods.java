package day9.java;

public class ExecutingMethods
{
    public static void main(String[] args) {

//        MethodsConcept mc = new MethodsConcept();
//        mc.a=12;
//        mc.b=8;
//        mc.addition();
//
//        System.out.println("================================");
//        MethodsConcept mc1= new MethodsConcept();
//        mc1.a=122;
//        mc1.b=88;
//        mc1.addition();
//
//        MethodWithParameterAndWithoutReturnType m = new MethodWithParameterAndWithoutReturnType();
//        m.addition(12,8);
//
//        MethodWithParameterAndWithoutReturnType m1 = new MethodWithParameterAndWithoutReturnType();
//        m1.addition(122,88);
//
        MethodWithLocalVariablesAndWithoutReturnType m1 = new MethodWithLocalVariablesAndWithoutReturnType();
        m1.addition(); //20

//        MethodWithLocalVariablesAndWithoutReturnType m2 = new MethodWithLocalVariablesAndWithoutReturnType();
//        m2.addition(); //20

        MethodWithLocalVariable tax = new MethodWithLocalVariable();
        tax.taxApplicable(100000);
    }
}
