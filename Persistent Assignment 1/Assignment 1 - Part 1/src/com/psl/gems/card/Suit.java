package com.psl.gems.card;

/*
 * This class represents the Suit of the card.
 *   
 * A suit has name and weight attributes.
 * 
 * Suit can be CLUB, DIAMOND, HEART, SPADE, and their weights will be 0, 1, 2, 3.
 */

public class Suit {
	private String name;
	private Integer weight;
	
	public Suit(String name, Integer weight) {
		this.name = name;
		this.weight = weight;
	}
	
	// Returns the name of the suit
	public String getName() {
		return name;
	}
	
	// Returns the weight of the suit
	public Integer getWeight() {
		return weight;
	}
}
