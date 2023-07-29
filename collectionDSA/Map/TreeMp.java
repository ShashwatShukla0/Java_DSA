package collectionDSA.Map;

import java.util.TreeMap;

public class TreeMp {

    public static void main(String[] args) {

        TreeMap<Integer,String> mp = new TreeMap<>();
        mp.put(1, "abc");
        mp.put(2, "def");
        mp.put(1, "egf");
        mp.put(5, "zxc");
        mp.put(4, "ghj");

        System.out.println(mp);

        TreeMap<String,Integer> pm = new TreeMap<>();

        pm.put("abc",1);
        pm.put("def",2);
        pm.put("egf",3);
        pm.put("abc",4);
        pm.put("bvd",4);

        System.out.println(pm);    
    }
    
}
