
package com.greenduck.vendingmachine.money.converter;

import static com.greenduck.vendingmachine.money.Currency.VND;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.CHF_TO_VND;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.EUR_TO_VND;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.USD_TO_VND;
import static com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants.VND_TO_VND;

import com.greenduck.vendingmachine.money.Currency;

public class VndCurrencyConverter implements CurrencyConverter {

	@Override
	public double convert(Currency base, double amount) {
		switch (base) {
		case VND:
			return amount * VND_TO_VND;
		case CHF:
			return amount * CHF_TO_VND;
		case USD:
			return amount * USD_TO_VND;
		case EUR:
			return amount * EUR_TO_VND;
		default:
			throw new UnsupportedCurrencyConversion(base, VND);
		}
	}

}
