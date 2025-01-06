package Day23.java;

import java.util.HashMap;

public class Collections_HashMap
{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Ashish", 343242);
        hm.put("Jason", 5654654);
        hm.put("Kerrie", 4654754);
        hm.put("John", 34345435);
        hm.put("John", 555555);
        hm.put("John", 111111);

//        System.out.println(hm.get("Ashish"));
        for (String name: hm.keySet())
        {
            System.out.println(name);
        }

        System.out.println("=====VALUES===============");

        for(Integer i: hm.values())
        {
            System.out.println(i);
        }

        System.out.println(hm);
    }
}

//HashMap: Store K,V pair
//Order is not maintained
//Duplicate Key is not allowed, if duplicate key exists, it will pick the key with latest value
