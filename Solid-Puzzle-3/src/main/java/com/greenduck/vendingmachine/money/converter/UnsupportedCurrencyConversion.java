
package com.greenduck.vendingmachine.money.converter;

import com.greenduck.vendingmachine.money.Currency;

public class UnsupportedCurrencyConversion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnsupportedCurrencyConversion(Currency from, Currency to) {
		super(String.format("Unable to convert %s to %s", from.name(), to.name()));
	}
	
	public UnsupportedCurrencyConversion(Currency currency) {
		super(String.format("Unsupported currency conversion for %s", currency.name()));
	}

}
