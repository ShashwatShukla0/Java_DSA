package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import collectionDSA.Student;

public class StreamListCollection {

    public static void main(String args[]) {

        //collection of data

        Student s1 = new Student(1,"abc","12th","english");
        Student s2 = new Student(2,"def","11th","hindi");
        Student s3 = new Student(3,"ghi","11th","maths");
        Student s4 = new Student(4,"jkl","10th","english");
        Student s5 = new Student(5,"mno","10th","physics");
        Student s6 = new Student(6,"pqr","12th","computer");
    
        List<Student> st= new ArrayList<>(); //new list to save the above data
    
        //adding it into the list created
            st.add(s1);
            st.add(s2);
            st.add(s3);
            st.add(s4);
            st.add(s5);
            st.add(s6);
        

        //returning the sorted order of class and storing it in a list
    
        List<Student> asc = st.stream().sorted(Comparator.comparing(Student::getClassn)).collect(Collectors.toList());
    
       
    
    
        asc.forEach(System.out::println);
        
    
        }
}
