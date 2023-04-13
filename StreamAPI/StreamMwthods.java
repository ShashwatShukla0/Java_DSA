package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class StreamMwthods {

    public static void main(String[] args){
        
        //filter(predicates)
         List<Integer> number = Arrays.asList(45,676,43,32,21,45,76,5,9);
         Integer inte = number.stream().min((x,y)-> x.compareTo(y)).get();
         System.out.println(inte);


        //map(functions)
        List<String> list = List.of("Ram","Shyam","Agnee","Rohit","Pranav");
        List<String> str = list.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(str);

        List<String> str2 = list.stream().filter(e ->e.endsWith("m")).collect(Collectors.toList());
        System.out.println(str2);

    }
    
}
