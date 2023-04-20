package com.psl.gems.card;

/*
 * This Exception will be used to throw the Exceptions related to the Card operations.
 */

public class CardException extends Exception {
	public CardException(String errorMessage) {
		super(errorMessage);
	}
}
