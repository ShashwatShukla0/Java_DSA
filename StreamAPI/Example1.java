package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

    //Without Stream functions

        public static void main(String[] args){
            //Create a list and sort it evenly
        List<Integer> l1 = List.of(2,39,32,21,35,56,43,3);

        List<Integer> l2 = new ArrayList<>();

        l2.add(7);
        l2.add(13);
        l2.add(16);
        l2.add(19);

        List<Integer> l3 = Arrays.asList(12,17,45,48);

        List<Integer> even = new ArrayList<>();

        for(Integer i: l1){
            if(i%2==0){
                even.add(i);
            }
        }

        System.out.println(l1);
        System.out.println(even);

    }
        
        
}
