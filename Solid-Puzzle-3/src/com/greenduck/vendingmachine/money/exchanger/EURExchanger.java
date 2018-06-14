package com.greenduck.vendingmachine.money.exchanger;

import com.greenduck.vendingmachine.exception.CurrencyNotSupportedException;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants;

public class EURExchanger extends Exchanger {

	@Override
	protected double getExchangeRateFor(Currency fromCurrency) {
		switch (fromCurrency) {
		case CHF:
			return CurrencyExchangeRateConstants.CHF_TO_EUR;
		case EUR:
			return CurrencyExchangeRateConstants.EUR_TO_EUR;
		case USD:
			return CurrencyExchangeRateConstants.USD_TO_EUR;
		case VND:
			return CurrencyExchangeRateConstants.VND_TO_EUR;
		default:
			throw new CurrencyNotSupportedException();
		}
	}
}
