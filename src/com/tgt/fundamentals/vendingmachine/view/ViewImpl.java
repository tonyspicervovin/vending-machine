package com.tgt.fundamentals.vendingmachine.view;

import com.tgt.fundamentals.vendingmachine.dto.Change;
import com.tgt.fundamentals.vendingmachine.dto.Product;

import java.util.List;
import java.util.Scanner;

public class ViewImpl implements View{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public int selectItem(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    @Override
    public double getMoney(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    @Override
    public void displayAllItem(List<Product> productList) {

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString());
        }
        System.out.println("0. Exit");
    }

    @Override
    public void displayChange(Change change) {
        System.out.println(change.toString());
    }
}
