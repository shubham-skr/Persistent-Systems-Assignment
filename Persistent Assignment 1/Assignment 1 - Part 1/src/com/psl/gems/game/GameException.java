package com.psl.gems.game;

/*
 *	This Exception will be used to throw the Exceptions related to the Game operations. 
 */

public class GameException extends Exception {
	public GameException(String errorMessage) {
		super(errorMessage);
	}
}
