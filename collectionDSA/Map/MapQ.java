package collectionDSA.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapQ {

    public static void main(String[] args) {

        Map<Integer,String> mp = new HashMap<>();

        mp.put(1, "abc");
        mp.put(2, "def");
        mp.put(1, "egf");
        mp.put(5, "zxc");
        mp.put(4, "ghj");

        System.out.println(mp);

        Map<String,Integer> pm = new HashMap<>();

        pm.put("abc",1);
        pm.put("def",2);
        pm.put("egf",3);
        pm.put("ccd",4);
        pm.put("bvd",4);

        System.out.println(pm);       

        


    }
    
}
