package com.psl.gems.card;

/*
 * This class represents the Card. 
 * 
 * A card has attributes suit and rank.
 * 
 * It implements Comparable to enable sorting by ascending and descending order.
 * 
 * It includes methods:
 * 
 * 		getValue() 		-  computes the value of the card as per the 
 * 					  	   given rules. 
 * 		
 * 		getJsonString() -  returns the Card details in JSON format.
 * 
 */

public class Card implements Comparable<Card> {
	private Suit suit;
	private Rank rank;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// Computes and returns the value of the card
	public Integer getValue() {
		int value = (rank.getWeight() * 4) + suit.getWeight();
		return value;
	}
	
	// Returns the Card name in JSON format
	public String getJsonString() {
		return String.format(
				"{\"%s\":\"%s\", \"%s\":\"%s\"}", 
				"SUIT", suit.getName(), "RANK", rank.getName());
	}
	
	@Override
	public String toString() {
		return (suit.getName() + "-" + rank.getName());
	}
	
	@Override 
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		
		if (!(o instanceof Card)) {
			return false;
		}
		
		Card c = (Card) o;
		
		return c.toString().equals(this.toString());
	}
	
	@Override 
	public int compareTo(Card card) {
		return this.toString().compareTo(card.toString());
	}
}
