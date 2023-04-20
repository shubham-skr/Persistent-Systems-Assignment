package com.psl.gems.player;

import java.util.*;
import com.psl.gems.card.*;

/*
 * This class represents the Player of the game. 
 * 
 * A player has attributes name and cardsInHand which contains the cards the player has.
 * 
 * It contains the following methods - 
 * 
 * 		getName 		- Returns the name of the player.
 * 
 * 		getCardsInHand 	- Returns the cards in hand of the player.		
 * 		
 * 		addCard 		- Add a card to the cards in hand of the player.
 * 		
 * 		getHighestCard  - Finds and returns the highest card among the cards in hand.
 */

public class Player {
	private String name;
	private List<Card> cardsInHand;
	
	public Player(String name) {
		this.name = name;
		this.cardsInHand = new ArrayList<>(Cards.MAX_CARDS);
	}
	
	@Override 
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		
		if (!(o instanceof Player)) {
			return false;
		}
		
		Player p = (Player) o;
		
		return p.getName().equals(this.name);
	}
	
	// Returns the name of the player.
	public String getName() {
		return name;
	}
	
	// Returns the cards in hand of the player.
	public List<Card> getCardsInHand() {
		return cardsInHand;
	}
	
	// Add a card to the cards in hand of the player.
	public void addCard(Card c) {
		if (cardsInHand.size() < Cards.MAX_CARDS) {
			cardsInHand.add(c);
		}
	}
	
	// Finds and returns the highest card among the cards in hand.
	public Card getHighestCard() {
		return Collections.max(cardsInHand, (card1, card2) -> 
			card1.getValue().compareTo(card2.getValue())
		);
	}
	
	@Override
	public String toString() {
		String s = name + ":\n";
		
		for(Card card : cardsInHand) {
			s += "\t" + card.toString() + " (" + card.getValue() + ")\n";
		}
		
		return s;
	}
}
