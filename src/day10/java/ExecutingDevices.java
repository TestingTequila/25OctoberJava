package day10.java;

import java.util.Arrays;

public class ExecutingDevices
{
    public static void main(String[] args) {
        Company cmp = new Company();
        String[] myDevices =cmp.getDevices("John");
        System.out.println(Arrays.toString(myDevices));
    }
}
