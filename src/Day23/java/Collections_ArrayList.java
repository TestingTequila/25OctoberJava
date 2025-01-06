package Day23.java;

import java.util.ArrayList;
import java.util.List;

public class Collections_ArrayList
{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // Top Casting

        list.add(12);
        list.add(44);
        list.add(54);
        list.add(100);
        list.add(76);
        list.add(100);
        for(Integer i : list)
        {
            System.out.println(i);
        }

        System.out.println(list);
    }
}


//1. ArrayList: The values are added in an ordered way[Order is maintained], Can add duplicate values as well

//2. HashSet :
//3. HashMap
