package com.tgt.fundamentals.vendingmachine.controller;

import com.tgt.fundamentals.vendingmachine.dto.Change;
import com.tgt.fundamentals.vendingmachine.dto.Product;
import com.tgt.fundamentals.vendingmachine.service.VendingMachineServiceLayer;
import com.tgt.fundamentals.vendingmachine.service.VendingMachineServiceLayerImpl;
import com.tgt.fundamentals.vendingmachine.view.View;
import com.tgt.fundamentals.vendingmachine.view.ViewImpl;

import java.util.List;

public class Controller {

    View view = new ViewImpl();
    VendingMachineServiceLayer vendingMachineServiceLayer = new VendingMachineServiceLayerImpl();

    public void Run() {
        boolean keepGoing = true;
        do{
            keepGoing = vendingMachine();
        }while (keepGoing);

    }

    private boolean vendingMachine() {
        List<Product> allProducts = loadAllProducts();

        view.displayAllItem(allProducts);

        int userSelection = view.selectItem("Please make a selection");

        if (userSelection == 0) {
            return false;
        }

        double money = view.getMoney("Please add money");

        Change change = sellProduct(userSelection, money);
        view.displayChange(change);
        return true;
    }

    private List<Product> loadAllProducts() {

        return vendingMachineServiceLayer.loadAllProducts();
    }

    private Change sellProduct(int userSelection, double money) {

        double changeInCents = vendingMachineServiceLayer.sellProduct(userSelection, money);
        Change change = calculateChange(changeInCents);
        return change;

    }

    private Change calculateChange(double change) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (change > .099999){
            while (change >= .25) {
                change = change - .25;
                quarters++;
            }
            while (change >= .10) {
                change = change - .10;
                dimes++;
            }
            while (change >= .05) {
                change = change - .05;
                nickels++;
            }
            while (change >= .01) {
                change = change - .01;
                pennies++;
            }

        }
        return new Change(quarters,dimes,nickels,pennies);
    }

}
