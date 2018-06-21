package com.greenduck.vendingmachine.money;

import java.util.HashMap;
import java.util.Map;

public class CurrencyExchangeRate {
	private Map<String, Double> currencyExchangeRateMap;

	public CurrencyExchangeRate() {
		currencyExchangeRateMap = new HashMap<>();
		currencyExchangeRateMap.put(CurrencyConverterConstants.CHF_TO_USD,
				CurrencyExchangeRateConstants.CHF_TO_USD);
		currencyExchangeRateMap.put(CurrencyConverterConstants.EUR_TO_USD,
				CurrencyExchangeRateConstants.EUR_TO_USD);
		currencyExchangeRateMap.put(CurrencyConverterConstants.VND_TO_USD,
				CurrencyExchangeRateConstants.VND_TO_USD);
		currencyExchangeRateMap.put(CurrencyConverterConstants.USD_TO_USD,
				CurrencyExchangeRateConstants.USD_TO_USD);

		currencyExchangeRateMap.put(CurrencyConverterConstants.CHF_TO_VND,
				CurrencyExchangeRateConstants.CHF_TO_VND);
		currencyExchangeRateMap.put(CurrencyConverterConstants.EUR_TO_VND,
				CurrencyExchangeRateConstants.EUR_TO_VND);
		currencyExchangeRateMap.put(CurrencyConverterConstants.VND_TO_VND,
				CurrencyExchangeRateConstants.VND_TO_VND);
		currencyExchangeRateMap.put(CurrencyConverterConstants.USD_TO_VND,
				CurrencyExchangeRateConstants.USD_TO_VND);

		currencyExchangeRateMap.put(CurrencyConverterConstants.CHF_TO_EUR,
				CurrencyExchangeRateConstants.CHF_TO_EUR);
		currencyExchangeRateMap.put(CurrencyConverterConstants.EUR_TO_EUR,
				CurrencyExchangeRateConstants.EUR_TO_EUR);
		currencyExchangeRateMap.put(CurrencyConverterConstants.VND_TO_EUR,
				CurrencyExchangeRateConstants.VND_TO_EUR);
		currencyExchangeRateMap.put(CurrencyConverterConstants.USD_TO_EUR,
				CurrencyExchangeRateConstants.USD_TO_EUR);

		currencyExchangeRateMap.put(CurrencyConverterConstants.CHF_TO_CHF,
				CurrencyExchangeRateConstants.CHF_TO_CHF);
		currencyExchangeRateMap.put(CurrencyConverterConstants.EUR_TO_CHF,
				CurrencyExchangeRateConstants.EUR_TO_CHF);
		currencyExchangeRateMap.put(CurrencyConverterConstants.VND_TO_CHF,
				CurrencyExchangeRateConstants.VND_TO_CHF);
		currencyExchangeRateMap.put(CurrencyConverterConstants.USD_TO_CHF,
				CurrencyExchangeRateConstants.USD_TO_CHF);
	}

	public Double getCurrencyExchangeRate(Currency curFrom, Currency curTo) {
		String key = curFrom + "_TO_" + curTo;
		return currencyExchangeRateMap.get(key);
	}
}
