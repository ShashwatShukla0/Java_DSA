package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {

        Patient p1 = new Patient(1, "P1", "Corona", 15000);
        Patient p2 = new Patient(2, "P2", "Fever", 12000);
        Patient p3 = new Patient(3, "P3", "Corona", 19000);
        Patient p4 = new Patient(4, "P4", "Corona", 22000);
        Patient p5 = new Patient(5, "P5", "Ache", 11000);

        List<Patient> l1 = Arrays.asList(p1,p2,p3,p4,p5);
        
        l1.stream().filter(p->p.getDisease().equals("Corona")).forEach(System.out::println);
        System.out.println();
        l1.stream().filter(p->p.getPrice()<18000).forEach(System.out::println);

        //Average bill paid by corona patient
        double bill = l1.stream().filter(p->p.getDisease().equals("Corona")).collect(Collectors.averagingDouble(Patient::getPrice));

        System.out.println(bill);

        l1.stream().filter(e->e.getDisease().startsWith("Fe")).forEach(System.out::println);
    }
    
}
