import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

    public static void main(String[] args){
        try {

            //creating read object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));

            Student s = (Student)in.readObject();

            //printing data of serialized object
            System.out.println(s.id+" "+ s.name);
            in.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
