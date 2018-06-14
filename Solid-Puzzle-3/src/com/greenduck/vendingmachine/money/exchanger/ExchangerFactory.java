package com.greenduck.vendingmachine.money.exchanger;

import com.greenduck.vendingmachine.exception.CurrencyNotSupportedException;
import com.greenduck.vendingmachine.money.Currency;

public class ExchangerFactory {

	private ExchangerFactory() {

	}

	public static Exchanger getExchanger(Currency currency) {
		switch (currency) {
		case CHF:
			return new CHFExchanger();
		case EUR:
			return new EURExchanger();
		case USD:
			return new USDExchanger();
		case VND:
			return new VNDExchanger();
		default:
			throw new CurrencyNotSupportedException();
		}
	}
}
