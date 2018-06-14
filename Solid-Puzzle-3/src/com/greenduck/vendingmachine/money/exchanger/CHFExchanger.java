package com.greenduck.vendingmachine.money.exchanger;

import com.greenduck.vendingmachine.exception.CurrencyNotSupportedException;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants;

public class CHFExchanger extends Exchanger {

	@Override
	protected double getExchangeRateFor(Currency fromCurrency) {
		switch (fromCurrency) {
		case CHF:
			return CurrencyExchangeRateConstants.CHF_TO_CHF;
		case EUR:
			return CurrencyExchangeRateConstants.EUR_TO_CHF;
		case USD:
			return CurrencyExchangeRateConstants.USD_TO_CHF;
		case VND:
			return CurrencyExchangeRateConstants.VND_TO_CHF;
		default:
			throw new CurrencyNotSupportedException();
		}
	}
}
