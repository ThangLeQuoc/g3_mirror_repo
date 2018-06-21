
package com.greenduck.vendingmachine.money.converter;

import com.greenduck.vendingmachine.money.Currency;

public interface CurrencyConverter {
	
	/**
	 * Converts the provided amount of a specific base {@link Currency} to its instance's {@link Currency}
	 *  
	 * @param base
	 * @param amount
	 * @return  the value of money based on its instance currency
	 */
	double convert(Currency base, double amount);
}
