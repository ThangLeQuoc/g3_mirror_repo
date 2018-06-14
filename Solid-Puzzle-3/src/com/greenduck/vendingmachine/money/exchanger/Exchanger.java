package com.greenduck.vendingmachine.money.exchanger;

import com.greenduck.vendingmachine.money.Banknote;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.PriceTag;

public abstract class Exchanger {

	public double exchange(Banknote banknote) {
		return banknote.getAmount() * getExchangeRateFor(banknote.getCurrency());
	}

	public double exchange(PriceTag priceTag) {
		return priceTag.getPrice() * getExchangeRateFor(priceTag.getCurrency());
	}

	protected abstract double getExchangeRateFor(Currency fromCurrency);
}
