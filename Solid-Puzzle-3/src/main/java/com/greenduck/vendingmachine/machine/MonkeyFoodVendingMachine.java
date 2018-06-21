package com.greenduck.vendingmachine.machine;

import com.greenduck.vendingmachine.foods.Food;
import com.greenduck.vendingmachine.money.Banknote;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.PriceTag;

/**
 * We hire a monkey coder to implement a sample vending machine for us. He gave
 * us this...
 */
public class MonkeyFoodVendingMachine extends FoodVendingMachine {

    public MonkeyFoodVendingMachine(Currency currency) {
        super(currency);
    }

    @Override
    public void addBalance(Banknote note) {
    	this.balance += currencyConverter.convert(note.getCurrency(), note.getAmount());
    }

    @Override
    public Food getFood(int selectedIndex) {
        verifyValidFoodSelection(selectedIndex);

        double currentBalance = getBalance();
        Food selectedFood = foods.get(selectedIndex);
        
        final PriceTag priceTag = selectedFood.getPriceTag();
        this.balance -= currencyConverter.convert(priceTag.getCurrency(), priceTag.getPrice());

        if (balance < 0) {
            System.out.println("In Your Dream");
            this.balance = currentBalance;
            selectedFood = null;
        } else {
            this.foods.remove(selectedIndex);
        }
        printBalance();
        return selectedFood;

    }

}
