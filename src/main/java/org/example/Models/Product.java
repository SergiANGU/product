package org.example.Models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String category;
    private String details;
    private int stok;



    public Product(String name, String category, String details, int stok) {
        this.name = name;
        this.category = category;
        this.details = details;
        this.stok = stok;
    }
    public Product(){}

    public List<Product> productList(){
        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        Product kingdomHearts = new Product("Kingdom Hearts", "Action", "Destroy the darkness and bring the light", 13);
        Product crashBandicoot = new Product("Crash Bandicoot", "Platforms", "Carlos el topo que gira", 50);
        Product marioKart = new Product("Mario Kart", "Racing", "pick a character and run", 33);
        List<Product> products = new ArrayList<>();
        products.add(eldenRing);
        products.add(kingdomHearts);
        products.add(crashBandicoot);
        products.add(marioKart);

        return products;
    }

    public String searchByName(List<Product> products, String name){
        for (Product p : products){
            if (p.name.equals(name)){
                return p.details;
            }
        }
        return null;
    }

    public String searchByCategory(List<Product> products, String category){
        for (Product p : products){
            if (p.category.equals(category)){
                return p.details;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public int getStok(Product product) {
        return product.stok;
    }
}
