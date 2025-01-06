package Day23.java;

import java.util.HashSet;
import java.util.Set;

public class Collections_HashSet
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // Top Casting
        set.add(12);
        set.add(45);
        set.add(100);
        set.add(22);
        set.add(-89);
        set.add(100);
        for(int n: set)
        {
            System.out.println(n);
        }

        System.out.println(set);
    }
}

//HashSet ==> Order is not maintained, Does not hold duplicate values
