import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Presist {

    public static void main(String[] args) {
        try {
            //creating object
            Student s1 = new Student(211, "ABC");

            //creating stream and writing objects
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();   //flushes the current o/p stream.

            out.close();    //closes the current o/p stream.

            System.out.println("Success");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
