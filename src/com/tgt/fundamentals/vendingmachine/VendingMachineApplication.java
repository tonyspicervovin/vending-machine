package com.tgt.fundamentals.vendingmachine;

import com.tgt.fundamentals.vendingmachine.controller.Controller;

public class VendingMachineApplication {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.Run();
    }
}
