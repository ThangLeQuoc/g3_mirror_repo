
package com.greenduck.vendingmachine.money.converter;

import static com.greenduck.vendingmachine.money.Currency.CHF;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.CHF_TO_CHF;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.EUR_TO_CHF;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.USD_TO_CHF;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.VND_TO_CHF;

import com.greenduck.vendingmachine.money.Currency;

public class ChfCurrencyConverter implements CurrencyConverter {

	@Override
	public double convert(Currency base, double amount) {
		switch (base) {
		case CHF:
			return amount * CHF_TO_CHF;
		case USD:
			return amount * USD_TO_CHF;
		case VND:
			return amount * VND_TO_CHF;
		case EUR:
			return amount * EUR_TO_CHF;
		default:
			throw new UnsupportedCurrencyConversion(base, CHF);
		}
	}

}
