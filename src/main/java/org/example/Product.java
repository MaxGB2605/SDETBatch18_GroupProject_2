package org.example;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int restock(int amount) {
        int totalStock = stockQuantity + amount;
        return totalStock;
    }

    public double sell(int amount) {
        int totalSell = stockQuantity - amount;
        if (totalSell < 0) {
            System.out.println("Out of stock");
            return 0;
        }
        setStockQuantity(stockQuantity - amount);
        System.out.println("items left "+totalSell);
        return amount * price;
    }

    public void printInfo() {
        System.out.println(productID + ", " + productName + ", " + price);
    }
}

class ProductTester {
    public static void main(String[] args) {
        Product product1 = new Product("sh1", "Sandals", 23.99, 5);
        product1.printInfo();
        System.out.println("Total sold " + product1.sell(15));
        product1.setProductName("Slippers");
        System.out.println("After modification sandals become " + product1.getProductName());
        System.out.println("After shipment quantity is: " + product1.restock(155));
        System.out.println("*****************");

        Product product2 = new Product("ach3", "Boots", 59.95, 78);
        product2.printInfo();
        product2.setProductName("Hiking boots");
        System.out.println("After modification boots become " + product2.getProductName());
        System.out.println("Product id is: " + product2.getProductID());
               System.out.println("Total sale :" + product2.sell(24));


    }
}