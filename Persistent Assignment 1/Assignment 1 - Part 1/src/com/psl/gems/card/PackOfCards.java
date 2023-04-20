package com.psl.gems.card;

import java.util.*;

/*
 * This class represents the Pack Of Cards. 
 * 
 * It initializes the full pack with the 52 cards from the Cards class.
 * 
 * For efficient operations, the top of the pack is considered from the end.
 * 
 * It contains the following methods - 
 * 
 *		constructor   - Initializes the full pack with 52 cards.
 *
 * 		shuffle 	  - Shuffles the pack.
 * 
 * 		getTopCard 	  - Returns the top of the card and removes it from the pack.
 * 					    If pack is empty, then throws Card Exception.
 * 
 * 		addCard 	  - Add the card to the pack if it not already present. 
 * 					    If the pack is full, then throws Card Exception.
 * 
 * 		getRandomCard - Returns a random card and remove it from the pack.
 * 						If the pack is empty, then throws Card Exception.
 * 		 
 * 		getSize 	  - Returns the size of the pack.
 * 
 * 		reset 		  - Sorts the pack in ascending order if isAsc is true. 
 						If false, then sorts the pack in decreasing order. 
 */

public class PackOfCards {
	private List<Card> fullPack;
	
	// Intializes the full pack with 52 cards.
	public PackOfCards() {
		fullPack = new ArrayList<>(Cards.TOTAL_CARDS); 
		
		// Add CLUB Cards 
		fullPack.add(Cards.CLUB_TWO);
		fullPack.add(Cards.CLUB_THREE);
		fullPack.add(Cards.CLUB_FOUR);
		fullPack.add(Cards.CLUB_FIVE);
		fullPack.add(Cards.CLUB_SIX);
		fullPack.add(Cards.CLUB_SEVEN);
		fullPack.add(Cards.CLUB_EIGHT);
		fullPack.add(Cards.CLUB_NINE);
		fullPack.add(Cards.CLUB_TEN);
		fullPack.add(Cards.CLUB_JACK);
		fullPack.add(Cards.CLUB_QUEEN);
		fullPack.add(Cards.CLUB_KING);
		fullPack.add(Cards.CLUB_ACE);
		
		// Add DIAMOND Cards 
		fullPack.add(Cards.DIAMOND_TWO);
		fullPack.add(Cards.DIAMOND_THREE);
		fullPack.add(Cards.DIAMOND_FOUR);
		fullPack.add(Cards.DIAMOND_FIVE);
		fullPack.add(Cards.DIAMOND_SIX);
		fullPack.add(Cards.DIAMOND_SEVEN);
		fullPack.add(Cards.DIAMOND_EIGHT);
		fullPack.add(Cards.DIAMOND_NINE);
		fullPack.add(Cards.DIAMOND_TEN);
		fullPack.add(Cards.DIAMOND_JACK);
		fullPack.add(Cards.DIAMOND_QUEEN);
		fullPack.add(Cards.DIAMOND_KING);
		fullPack.add(Cards.DIAMOND_ACE);
		
		// Add HEART Cards 
		fullPack.add(Cards.HEART_TWO);
		fullPack.add(Cards.HEART_THREE);
		fullPack.add(Cards.HEART_FOUR);
		fullPack.add(Cards.HEART_FIVE);
		fullPack.add(Cards.HEART_SIX);
		fullPack.add(Cards.HEART_SEVEN);
		fullPack.add(Cards.HEART_EIGHT);
		fullPack.add(Cards.HEART_NINE);
		fullPack.add(Cards.HEART_TEN);
		fullPack.add(Cards.HEART_JACK);
		fullPack.add(Cards.HEART_QUEEN);
		fullPack.add(Cards.HEART_KING);
		fullPack.add(Cards.HEART_ACE);
		
		// Add SPADE Cards
		fullPack.add(Cards.SPADE_TWO);
		fullPack.add(Cards.SPADE_THREE);
		fullPack.add(Cards.SPADE_FOUR);
		fullPack.add(Cards.SPADE_FIVE);
		fullPack.add(Cards.SPADE_SIX);
		fullPack.add(Cards.SPADE_SEVEN);
		fullPack.add(Cards.SPADE_EIGHT);
		fullPack.add(Cards.SPADE_NINE);
		fullPack.add(Cards.SPADE_TEN);
		fullPack.add(Cards.SPADE_JACK);
		fullPack.add(Cards.SPADE_QUEEN);
		fullPack.add(Cards.SPADE_KING);
		fullPack.add(Cards.SPADE_ACE);	
	}
	
	// Shuffles the pack.
	public void shuffle() {
		Collections.shuffle(fullPack);
	}
	
	/* Returns the top of the card and removes it from the pack. If pack is empty, 
	 * then throws Card Exception.
	 */
	public Card getTopCard() throws CardException {
		if (fullPack.isEmpty()) {
			throw new CardException("Pack of Cards is empty.");
		}
		
		Card topCard = fullPack.get(fullPack.size() - 1);
		fullPack.remove(fullPack.size()-1);
		
		return topCard;
	}
	
	/* Add the card to the pack if it not already present. If the pack is full,
	 * then throws Card Exception. 
	 */
	public void addCard(Card c) throws CardException {
		if (fullPack.contains(c)) {
			throw new CardException("Duplicate cards are not allowed.");
		}
		if (fullPack.size() == Cards.TOTAL_CARDS) {
			throw new CardException("Pack of Cards is full.");
		}
		
		fullPack.add(c);
	}
	
	/* Returns a random card and remove it from the pack. If the pack is empty, 
	 * then throws Card Exception.
	 */
	public Card getRandomCard() throws CardException {
		if (fullPack.isEmpty()) {
			throw new CardException("Pack of Cards is empty.");
		}
		
		// Generates a random number between 0 and pack size.
		Random rand = new Random();
		int randomIndex = rand.nextInt(fullPack.size());
		
		Card randomCard = fullPack.get(randomIndex);
		fullPack.remove(randomIndex);
		
		return randomCard;
	}
	
	// Returns the size of the pack.
	public Integer getSize() {
		return fullPack.size();
	}
	
	/* Sorts the pack in ascending order if isAsc is true. If false, then sorts the 
	 * pack in decreasing order. 
	 */
	public void reset(boolean isAsc) {
		if (isAsc) {
			Collections.sort(fullPack, Collections.reverseOrder());
		} else {
			Collections.sort(fullPack);
		}
	}	
}
