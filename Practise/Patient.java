package Practise;

public class Patient {

    int id;
    String name;
    String disease;
    int price;

    Patient(int id,String name,String disease,int price){
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.price = price;

    }

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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", disease=" + disease + ", price=" + price + "]";
    }
    
    
}
