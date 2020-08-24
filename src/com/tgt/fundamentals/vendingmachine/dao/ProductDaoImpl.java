package com.tgt.fundamentals.vendingmachine.dao;

import com.tgt.fundamentals.vendingmachine.dto.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDaoImpl implements ProductDao{

    HashMap<Integer,Product> productMap = new HashMap<>();



    @Override
    public List<Product> loadAllProducts() {

        addProductsToMap();
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product getProductById(int id) {
        return productMap.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    private void addProductsToMap() {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Coke");
        p1.setPrice(1.5);
        p1.setInventoryLevel(20);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Chips");
        p2.setPrice(2.5);
        p2.setInventoryLevel(10);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("Candy");
        p3.setPrice(.75);
        p3.setInventoryLevel(30);

        productMap.put(p1.getId(), p1);
        productMap.put(p2.getId(), p2);
        productMap.put(p3.getId(), p3);
    }
}
