package InterviewQ;

import java.util.HashMap;

public class Occurence {

    public static void main(String[] args) {

        String str = "Banana";
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            Integer value = mp.get(ch);
            if(value!= null) {
                mp.put(ch, value+1);
            } else {
                mp.put(ch, 1);
            }
        }

        System.out.println(mp);
    }
    
}
