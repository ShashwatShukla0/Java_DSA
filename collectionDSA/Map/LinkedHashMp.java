package collectionDSA.Map;

import java.util.LinkedHashMap;

public class LinkedHashMp {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> mp = new LinkedHashMap<>();
        
        mp.put(1, "abc");
        mp.put(2, "def");
        mp.put(1, "egf");
        mp.put(5, "zxc");
        mp.put(4, "ghj");

        System.out.println(mp);

        LinkedHashMap<String,Integer> pm = new LinkedHashMap<>();

        pm.put("abc",1);
        pm.put("def",2);
        pm.put("egf",3);
        pm.put("abc",4);
        pm.put("bvd",4);

        System.out.println(pm);    
    }
    
}
