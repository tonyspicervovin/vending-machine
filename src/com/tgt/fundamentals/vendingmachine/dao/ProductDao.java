package com.tgt.fundamentals.vendingmachine.dao;

import com.tgt.fundamentals.vendingmachine.dto.Product;

import java.util.List;

public interface ProductDao {

    List<Product> loadAllProducts();
    public Product getProductById(int id);

    void updateProduct(Product product);
}
