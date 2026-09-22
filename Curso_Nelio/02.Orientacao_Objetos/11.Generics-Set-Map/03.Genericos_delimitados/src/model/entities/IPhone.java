package model.entities;

public class IPhone extends Product {

    public IPhone(String name, String model, Double price) {
        super(name, model, price);
    }

    public IPhone(String name, Double price) {
        super(name, price);
    }

}
