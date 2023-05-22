package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {

    int id;
    String name;
    int price;

    Product(int id,String name,int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return id+" "+name+" "+price;
    }
}

public class SimpleStream {

    public static void main(String[] args) {

        List<Product> l1 = new ArrayList<>();

        l1.add(new Product(1, "Soap", 30));
        l1.add(new Product(2, "Biscuit", 10));
        l1.add(new Product(3, "Maggie", 24));
        l1.add(new Product(4, "Drink", 60));
        l1.add(new Product(5, "CHocolate", 90));
        l1.add(new Product(6, "Medicine", 40));

         l1.stream()
            .filter(e->e.price>=40)
            .map(pm->pm.price)
            .forEach(System.out::println);
        List<String> l2 = l1.stream()
                        
                            .filter(f->f.price>=40)
                            .map(fm->fm.toString())
                            .collect(Collectors.toList());      

        System.out.println(l2);

        
    }
    
}
