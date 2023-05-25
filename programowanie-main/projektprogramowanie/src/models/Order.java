package models;

import java.util.LinkedList;

public class Order extends BasicData {
    private String address;
    private LinkedList<String> cart = new LinkedList<String>();

    public String getAddress() {
        return this.address;
    }

    public LinkedList<String> getCart() {
        return this.cart;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addToCart(String dish) {
        this.cart.add(dish);
        System.out.println("Twoj koszyk:"+cart);
    }

    public void clearCart() {
        this.cart.clear();
    }

}
