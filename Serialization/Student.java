import java.io.Serializable;

//since its implements serializable interface, it can be converted fromobjects to stream
class Student implements Serializable {

    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
