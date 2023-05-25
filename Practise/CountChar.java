package Practise;

import java.util.Set;
import java.util.TreeSet;

public class CountChar {

    public static void main(String[] args) {

        String str = "I am a developer";
        countOccur(str);
    }

    static void countOccur(String str) {

        char[] arr = str.toCharArray();

        Set<Character> st = new TreeSet<>();

        for(char c: arr){
            st.add(c);
        }

        //st.forEach(System.out::println);

        for(char c: st){
            long count = str.chars().filter(ch->ch==c).count();
            System.out.println(c+": "+count);
        }
    }
    
}
