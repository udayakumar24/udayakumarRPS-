package com.wipro.shoppingapp;
import java.util.Stack;
import java.util.LinkedList;

class PurchaseHistory {
    private Stack<LinkedList<String>> history;

    public PurchaseHistory() {
        this.history = new Stack<>();
    }

    public void savePurchase(LinkedList<String> cart) {
        history.push(new LinkedList<>(cart)); // Save a copy of the cart
        System.out.println("Purchase saved.");
    }

    public void undoLastPurchase() {
        if(history.isEmpty()) {
            System.out.println("No purchase to undo.");
        } else {
            LinkedList<String> lastPurchase = history.pop();
            System.out.println("Last purchase undone. Items in the last purchase:");
            for(String item : lastPurchase) {
                System.out.println("- " + item);
            }
        }
    }

    public void viewPurchaseHistory() {
        if(history.isEmpty()) {
            System.out.println("No purchase history available.");
        } else {
            System.out.println("Purchase history:");
            for(LinkedList<String> purchase : history) {
                System.out.println("Purchase:");
                for(String item : purchase) {
                    System.out.println("- " + item);
                }
            }
        }
    }
}

