package models;

import java.util.ArrayList;

public class Sale {

    private Customer customer;
    private ArrayList<Product> products;

   
    public Sale(Customer customer, ArrayList<Product> products) {
        this.customer = customer;
        this.products = products;

    }

    public String getSale() {
        return "O cliente " + this.customer.getName() + " comprou " + products.toString();
    }

}