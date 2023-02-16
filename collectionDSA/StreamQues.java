package collectionDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamQues {

    public static void main(String args[]) {

    Student s1 = new Student(1,"abc","12th","english");
    Student s2 = new Student(2,"def","11th","hindi");
    Student s3 = new Student(3,"ghi","11th","maths");
    Student s4 = new Student(4,"jkl","10th","english");
    Student s5 = new Student(5,"mno","10th","physics");
    Student s6 = new Student(6,"pqr","12th","computer");

    List<Student> st = new ArrayList<>();
    
    st.add(s1);
    st.add(s2);
    st.add(s3);
    st.add(s4);
    st.add(s5);
    st.add(s6);

    //Find STudent with a particular name
    Optional<Student> stud = st.stream()
                               .filter(student->student.getName().equals("def"))
                               .findFirst();
    System.out.println(stud.isPresent() ? stud.get().toString():"No SUch STudent");
    System.out.println("_______________");


    }

    
}
