package com.greenduck.vendingmachine.money.exchanger;

import com.greenduck.vendingmachine.exception.CurrencyNotSupportedException;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants;

public class USDExchanger extends Exchanger {

	@Override
	protected double getExchangeRateFor(Currency fromCurrency) {
		switch (fromCurrency) {
		case CHF:
			return CurrencyExchangeRateConstants.CHF_TO_USD;
		case EUR:
			return CurrencyExchangeRateConstants.EUR_TO_USD;
		case USD:
			return CurrencyExchangeRateConstants.USD_TO_USD;
		case VND:
			return CurrencyExchangeRateConstants.VND_TO_USD;
		default:
			throw new CurrencyNotSupportedException();
		}
	}
}
