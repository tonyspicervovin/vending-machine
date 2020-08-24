package com.tgt.fundamentals.vendingmachine.view;

import com.tgt.fundamentals.vendingmachine.dto.Change;
import com.tgt.fundamentals.vendingmachine.dto.Product;

import java.util.List;

public interface View {
    public void displayMessage(String message);
    public int selectItem(String message);
    public double getMoney(String message);
    public void displayAllItem(List<Product> productList);
    public void displayChange(Change change);

}
