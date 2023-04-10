package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExm {

    public static void main(String args[]){
    
    HashMap<String,Integer> mp = new HashMap<>();

    mp.put("English",45);
    mp.put("Hindi",40);
    mp.put("Maths",48);

    System.out.println(mp);
    System.out.println(mp.size());

    if(mp.containsKey("Maths")){
        Integer a = mp.get("Maths");
        System.out.println("Value for Maths: "+a);
    }

    //Iteration in HashMap
    for(Map.Entry<String,Integer> e: mp.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }

    Set<String> keys = mp.keySet();

    for(String key : keys) {
        System.out.println(key+" "+mp.get(key));
    }

    mp.remove("English");
    System.out.println(mp);

    }
    
}
