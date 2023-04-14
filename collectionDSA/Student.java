package collectionDSA;

public class Student {

    int id;

    String name;

    String classn;

    String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassn() {
        return classn;
    }

    public void setClassn(String classn) {
        this.classn = classn;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", classn=" + classn + ", subject=" + subject + "]";
    }

    public Student(int id,String name,String classn,String subject){
        this.id=id;
        this.name=name;
        this.classn=classn;
        this.subject=subject;
    }
    
}
