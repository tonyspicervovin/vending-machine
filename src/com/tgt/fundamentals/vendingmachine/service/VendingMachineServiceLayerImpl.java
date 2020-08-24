package com.tgt.fundamentals.vendingmachine.service;

import com.tgt.fundamentals.vendingmachine.dao.ProductDao;
import com.tgt.fundamentals.vendingmachine.dao.ProductDaoImpl;
import com.tgt.fundamentals.vendingmachine.dto.Product;

import java.util.List;

public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    ProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> loadAllProducts() {
        return productDao.loadAllProducts();
    }

    @Override
    public double sellProduct(int itemId, double money) {
        Product product = productDao.getProductById(itemId);
        product.setInventoryLevel(product.getInventoryLevel()-1);

        productDao.updateProduct(product);

        double change = money - product.getPrice();
        return change;
    }
}
