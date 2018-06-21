
package com.greenduck.vendingmachine.money.converter;

import static com.greenduck.vendingmachine.money.Currency.USD;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.CHF_TO_USD;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.EUR_TO_USD;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.USD_TO_USD;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.VND_TO_USD;

import com.greenduck.vendingmachine.money.Currency;

public class UsdCurrencyConverter implements CurrencyConverter {

	@Override
	public double convert(Currency base, double amount) {
		switch (base) {
		case USD:
			return amount * USD_TO_USD;
		case CHF:
			return amount * CHF_TO_USD;
		case VND:
			return amount * VND_TO_USD;
		case EUR:
			return amount * EUR_TO_USD;
		default:
			throw new UnsupportedCurrencyConversion(base, USD);
		}
	}

}
