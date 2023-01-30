package oopsDSA;


class employee {

int salary=50000;

}


public class Inheritance extends employee {

int bonus=5000;


public static void main(String args[]) {

Inheritance i = new Inheritance();

System.out.println("Parent: "+ i.salary);

System.out.println("Child: "+ i.bonus);

}

}


