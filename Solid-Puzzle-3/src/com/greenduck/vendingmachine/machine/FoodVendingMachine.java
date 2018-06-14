package com.greenduck.vendingmachine.machine;

import java.util.ArrayList;
import java.util.List;

import com.greenduck.vendingmachine.foods.Food;
import com.greenduck.vendingmachine.money.Banknote;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.exchanger.Exchanger;
import com.greenduck.vendingmachine.money.exchanger.ExchangerFactory;

public abstract class FoodVendingMachine {

	public static final String ERR_MESSAGE_INVALID_FOOD_SELECTION = "Invalid Food Selection";

	protected double balance;

	protected Currency currency;

	protected List<Food> foods;

	protected Exchanger exchanger;

	public FoodVendingMachine(Currency currency) {
		this.foods = new ArrayList<>();
		this.currency = currency;

		exchanger = ExchangerFactory.getExchanger(currency);
	}

	/**
	 * Change current accepted currency of the vending machine. This will also wipe
	 * out all current balance if there is a currency discrepancy.
	 */
	public void setCurrency(Currency currency) {
		if (!this.currency.equals(currency)) {
			balance = 0;
		}
		this.currency = currency;

		exchanger = ExchangerFactory.getExchanger(currency);
	}

	public Currency getCurrency() {
		return currency;
	}

	/*
	 * FIXME (tung Jun 14, 2018): using double to represent money is nearly criminal
	 */
	public double getBalance() {
		return balance;
	}

	public void printBalance() {
		System.out.println("Current Balance: " + balance + " " + currency.name());
	}

	public void addFood(Food food) {
		this.foods.add(food);
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	protected void verifyValidFoodSelection(int selectedIndex) {
		if (selectedIndex >= this.foods.size()) {
			throw new IllegalArgumentException(ERR_MESSAGE_INVALID_FOOD_SELECTION);
		}
	}

	/* Playground */
	public abstract void addBalance(Banknote note);

	public abstract Food getFood(int selectedIndex);

}
