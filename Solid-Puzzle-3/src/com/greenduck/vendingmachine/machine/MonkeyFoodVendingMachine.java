package com.greenduck.vendingmachine.machine;

import com.greenduck.vendingmachine.foods.Food;
import com.greenduck.vendingmachine.money.Banknote;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.CurrencyExchangeRate;

/**
 * We hire a monkey coder to implement a sample vending machine for us. He gave
 * us this...
 */
public class MonkeyFoodVendingMachine extends FoodVendingMachine {

    private CurrencyExchangeRate currencyExchangeRate = new CurrencyExchangeRate();

    public MonkeyFoodVendingMachine(Currency currency) {
        super(currency);
    }

    @Override
    public void addBalance(Banknote note) {
        Double currencyExchangeRateCur = currencyExchangeRate.getCurrencyExchangeRate(note.getCurrency(),
                getCurrency());
        this.balance += note.getAmount() * currencyExchangeRateCur;
    }

    @Override
    public Food getFood(int selectedIndex) {
        verifyValidFoodSelection(selectedIndex);

        double currentBalance = getBalance();
        Food selectedFood = foods.get(selectedIndex);

        Double currencyExchangeRateCur = currencyExchangeRate
                .getCurrencyExchangeRate(selectedFood.getPriceTag().getCurrency(), getCurrency());

        this.balance -= selectedFood.getPriceTag().getPrice() * currencyExchangeRateCur;

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
