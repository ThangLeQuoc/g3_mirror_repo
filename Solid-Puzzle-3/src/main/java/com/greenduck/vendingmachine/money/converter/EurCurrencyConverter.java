
package com.greenduck.vendingmachine.money.converter;

import static com.greenduck.vendingmachine.money.Currency.EUR;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.CHF_TO_EUR;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.EUR_TO_EUR;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.USD_TO_EUR;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.VND_TO_EUR;

import com.greenduck.vendingmachine.money.Currency;

public class EurCurrencyConverter implements CurrencyConverter {

	@Override
	public double convert(Currency base, double amount) {
		switch (base) {
		case EUR:
			return amount * EUR_TO_EUR;
		case CHF:
			return amount * CHF_TO_EUR;
		case VND:
			return amount * VND_TO_EUR;
		case USD:
			return amount * USD_TO_EUR;
		default:
			throw new UnsupportedCurrencyConversion(base, EUR);
		}
	}

}
