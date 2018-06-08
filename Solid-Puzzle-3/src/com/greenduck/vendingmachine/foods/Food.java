package com.greenduck.vendingmachine.foods;

public abstract class Food {
    private String name;
    private int price;
    
    public String getName() {
        return name;
    }
        
    public int getPrice() {
        return price;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected void setPrice(int price) {
        this.price = price;
    }
    
}
