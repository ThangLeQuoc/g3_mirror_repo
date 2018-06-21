
package com.greenduck.vendingmachine.money.converter;

import com.greenduck.vendingmachine.money.Currency;

public class CurrencyConverterFactory {

	public static CurrencyConverter getConverter(Currency base) throws UnsupportedCurrencyConversion {
		switch (base) {
		case VND:
			return new VndCurrencyConverter();
		case EUR:
			return new EurCurrencyConverter();
		case USD:
			return new UsdCurrencyConverter();
		case CHF:
			return new ChfCurrencyConverter();
		default:
			throw new UnsupportedCurrencyConversion(base);
		}
	}
}
