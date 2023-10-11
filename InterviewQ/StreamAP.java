package InterviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    int price;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    Product(int id,String name,int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    
}

public class StreamAP {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Samsung", 20000);
        Product p2 = new Product(2, "Apple", 70000);
        Product p3 = new Product(3, "OnePlus", 40000);
        Product p4 = new Product(4, "Mi", 18000);
        Product p5 = new Product(5, "Oppo", 14000);
        Product p6 = new Product(6, "Nokia", 8000);

        List<Product> l1 = new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);
        l1.add(p5);
        l1.add(p6);

        l1.stream().forEach(System.out::println);

        List<Product> l2 = l1.stream().filter(e->e.price<=20000).collect(Collectors.toList());
        System.out.println(l2);
        

    }
    
}
