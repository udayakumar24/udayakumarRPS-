package com.wipro.shoppingapp;

public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PurchaseHistory history = new PurchaseHistory();
        CustomerService service = new CustomerService();

       
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.viewCart();
        cart.removeItem("Banana");
        cart.viewCart();

<<<<<<< HEAD
        
=======
       
>>>>>>> cac295815c437bf6045eebb8c36941714e6c9c69
        history.savePurchase(cart.getCart());
        cart.addItem("Orange");
        history.savePurchase(cart.getCart());
        history.viewPurchaseHistory();
        history.undoLastPurchase();
        history.viewPurchaseHistory();

<<<<<<< HEAD
       
=======
        
>>>>>>> cac295815c437bf6045eebb8c36941714e6c9c69
        service.addRequest("Need help with my order.");
        service.addRequest("Change delivery address.");
        service.viewPendingRequests();
        service.processRequest();
        service.viewPendingRequests();
    }
}
