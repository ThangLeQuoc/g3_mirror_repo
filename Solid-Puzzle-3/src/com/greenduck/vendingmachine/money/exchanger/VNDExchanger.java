package com.greenduck.vendingmachine.money.exchanger;

import com.greenduck.vendingmachine.exception.CurrencyNotSupportedException;
import com.greenduck.vendingmachine.money.Currency;
import com.greenduck.vendingmachine.money.CurrencyExchangeRateConstants;

public class VNDExchanger extends Exchanger {

	@Override
	protected double getExchangeRateFor(Currency fromCurrency) {
		switch (fromCurrency) {
		case CHF:
			return CurrencyExchangeRateConstants.CHF_TO_VND;
		case EUR:
			return CurrencyExchangeRateConstants.EUR_TO_VND;
		case USD:
			return CurrencyExchangeRateConstants.USD_TO_VND;
		case VND:
			return CurrencyExchangeRateConstants.VND_TO_VND;
		default:
			throw new CurrencyNotSupportedException();
		}
	}
}
