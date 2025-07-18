package application.entities;

public class Product {
    String name;
    double price;
    int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if(quantity < quantity){
            this.quantity -= quantity;
        }
    }
}
