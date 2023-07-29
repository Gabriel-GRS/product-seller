import java.util.ArrayList;

import models.Customer;
import models.Product;
import models.Sale;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Product> productsSale = new ArrayList<Product>();

        Customer customer1 = new Customer("Gabriel", 290.2);
        Product product1 = new Product("Farinha", 2.99);
        Product product2 = new Product("Sal", 4.99);


        productsSale.add(product1);
        productsSale.add(product2);

        Sale sale = new Sale(customer1, productsSale);

        System.out.println(sale.getSale());
    }
}
