package org.example.Models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product();
    @Test
    void gived_a_new_products_when_procesed_then_return_a_list_of_them() {

        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        Product kingdomHearts = new Product("Kingdom Hearts", "Action", "Destroy the darkness and bring the light", 13);
        Product crashBandicoot = new Product("Crash Bandicoot", "Platforms", "Carlos el topo que gira", 50);
        Product marioKart = new Product("Mario Kart", "Racing", "pick a character and run", 33);
        List<Product> result = Arrays.asList(eldenRing, kingdomHearts, crashBandicoot, marioKart);

        List<Product> expected = product.productList();
        assertEquals(result.get(0).getName(), expected.get(0).getName());
        assertEquals(result.get(1).getName(), expected.get(1).getName());
        assertEquals(result.get(2).getName(), expected.get(2).getName());
        assertEquals(result.get(3).getName(), expected.get(3).getName());
    }

    @Test
    void gived_a_list_of_products_search_by_name_then_return_details(){
        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        Product kingdomHearts = new Product("Kingdom Hearts", "Action", "Destroy the darkness and bring the light", 13);
        Product crashBandicoot = new Product("Crash Bandicoot", "Platforms", "Carlos el topo que gira", 50);
        Product marioKart = new Product("Mario Kart", "Racing", "pick a character and run", 33);
        List<Product> products = Arrays.asList(eldenRing, kingdomHearts, crashBandicoot, marioKart);

        String details = product.searchByName(products, "Crash Bandicoot");

        assertEquals(details, crashBandicoot.getDetails());
    }

    @Test
    void gived_a_list_of_products_search_by_non_existing_name_then_return_null(){
        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        Product kingdomHearts = new Product("Kingdom Hearts", "Action", "Destroy the darkness and bring the light", 13);
        Product crashBandicoot = new Product("Crash Bandicoot", "Platforms", "Carlos el topo que gira", 50);
        Product marioKart = new Product("Mario Kart", "Racing", "pick a character and run", 33);
        List<Product> products = Arrays.asList(eldenRing, kingdomHearts, crashBandicoot, marioKart);

        String details = product.searchByName(products, "Resident Evil");

        assertEquals(details, null);
    }

    @Test
    void gived_a_list_of_products_search_by_category_then_return_details(){
        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        Product kingdomHearts = new Product("Kingdom Hearts", "Action", "Destroy the darkness and bring the light", 13);
        Product crashBandicoot = new Product("Crash Bandicoot", "Platforms", "Carlos el topo que gira", 50);
        Product marioKart = new Product("Mario Kart", "Racing", "pick a character and run", 33);
        List<Product> products = Arrays.asList(eldenRing, kingdomHearts, crashBandicoot, marioKart);

        String details = product.searchByCategory(products, "Action");

        assertEquals(details, kingdomHearts.getDetails());
    }

    @Test
    void gived_a_list_of_products_search_by_non_existing_category_then_return_details(){
        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        Product kingdomHearts = new Product("Kingdom Hearts", "Action", "Destroy the darkness and bring the light", 13);
        Product crashBandicoot = new Product("Crash Bandicoot", "Platforms", "Carlos el topo que gira", 50);
        Product marioKart = new Product("Mario Kart", "Racing", "pick a character and run", 33);
        List<Product> products = Arrays.asList(eldenRing, kingdomHearts, crashBandicoot, marioKart);

        String details = product.searchByCategory(products, "souls like");

        assertEquals(details, null);
    }

    @Test
    void gived_a_product_when_procesed_then_return_the_stock(){
        Product eldenRing = new Product("Elden Ring", "RPG", "Become the elden lord", 34);
        int result = product.getStok(eldenRing);

        assertEquals(result, 34);
    }
}