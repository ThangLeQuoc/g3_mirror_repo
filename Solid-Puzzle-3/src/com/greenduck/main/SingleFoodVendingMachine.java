package com.greenduck.main;

import java.util.ArrayList;
import java.util.List;

import com.greenduck.vendingmachine.foods.Food;
import com.greenduck.vendingmachine.money.Banknote;
import com.greenduck.vendingmachine.money.Currency;

public class SingleFoodVendingMachine {
    
    
    private List<Food> availableFoods;
    
    private long balance;
    
    public SingleFoodVendingMachine() {
        availableFoods = new ArrayList<>();
    }
    
    public Food getFood(int i) {
        if (i > availableFoods.size())
            throw new IllegalArgumentException("Invalid Food Number Choice");
        return availableFoods.get(i);
    }
    
    public void addFood(Food food) {
        availableFoods.add(food);
    }
    
    
    
    public void addBalance(Banknote bankNote) {
        
        long USD_TO_VND = 23000;
        
        /* Responsible for money converting */
        if (Currency.VND.equals(bankNote.getCurrency())) {
            this.balance += bankNote.getAmount();
        }
        else if (Currency.USD.equals(bankNote.getCurrency())) {
            this.balance += bankNote.getAmount() * USD_TO_VND;
        }
        
    }
    
    
}
