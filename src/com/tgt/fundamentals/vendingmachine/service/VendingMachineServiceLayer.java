package com.tgt.fundamentals.vendingmachine.service;

import com.tgt.fundamentals.vendingmachine.dto.Product;

import java.util.List;

public interface VendingMachineServiceLayer {

    public List<Product> loadAllProducts();
    public double sellProduct(int itemId, double money);
}
