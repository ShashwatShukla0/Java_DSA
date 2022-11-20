package oopsDSA;

class Student {
	int id;
	String name;
	
	public void info() {
		this.id = id;
		this.name = name;
	}
}

public class StudentClass {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.id=4;
		s1.name="ABCD";
		
		System.out.println(s1.id+" "+s1.name);
	}

}
