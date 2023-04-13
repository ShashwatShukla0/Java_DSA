package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args){

        //collection of objects

        //blank
        Stream<Object> stream = Stream.empty();

        //array,object,collection
        String names[] = {"Ram","SHyam","Rahul","Raju","Hitesh"};

        Stream<Object> st = Stream.of(names);
        st.forEach(e ->{
            System.out.println(e);
        });

        List<Integer> stream1 = Arrays.asList(1,2,3,4,5);
        stream1.forEach(i->{
            System.out.println(i);
        });
    }
    
}
