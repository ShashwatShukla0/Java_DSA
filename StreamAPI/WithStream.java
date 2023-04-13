package StreamAPI;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStream {

    public static void main(String[] args){

        List<Integer> l1 = List.of(2,39,32,21,35,56,43,3);

        List<Integer> l2 = new ArrayList<>();

        l2.add(7);
        l2.add(32);
        l2.add(16);
        l2.add(19);
        l2.add(53);
        

        List<Integer> l3 = Arrays.asList(12,17,45,48);

        //With Stream
        Stream<Integer> st = l1.stream();
        List<Integer> newList = st.filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        //All number greater than 20
        List<Integer> great = l2.stream().filter(i -> i>20).collect(Collectors.toList());
        System.out.println(great);

        List<Integer> less = l3.stream().filter(i -> i<25).collect(Collectors.toList());
        System.out.println(less);

        
    }
}
