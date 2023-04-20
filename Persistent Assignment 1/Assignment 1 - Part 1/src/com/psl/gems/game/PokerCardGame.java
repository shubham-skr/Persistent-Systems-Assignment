package com.psl.gems.game;

import java.util.*;
import com.psl.gems.card.*;
import com.psl.gems.player.*;

/*
 * This class represents the Poker Card Game.
 * 
 * It has attributes:
 * 		packOfCards - Represents the pack of cards to be used to play the game.
 * 		players 	- contains the list of players registered for the game.
 * 
 * It has following public methods: 
 * 		getPlayers  - Returns the list of players.
 * 		
 * 		register 	- Register the player for the game. Adds the given player to 
 * 					  Players list. If maximum players reached or the player has 
 * 					  already registered, then throws Game Exception.
 *
 *		play 		- Starts the game. If number of players less than 2, 
 *					  then throws Card Exception.
 *
 * It has following private methods: 
 * 		distributeCards 		- Shuffle the pack and distribute the cards 
 * 								  among the players.
 * 
 * 		getPlayersHighestCard 	- Finds and returns the highest card of each player.
 *		
 *		getWinner 				- Determines and returns the winner of the game. 
 *								  Winner is the player with the highest card among 
 *								  all the players.
 *
 *		printGame 				- Display the game details and the winner.
 */

public class PokerCardGame {
	private PackOfCards packOfCards;
	private List<Player> players;
	
	public PokerCardGame() {
		this.packOfCards = new PackOfCards();
		this.players = new ArrayList<>(Cards.MAX_PLAYERS);
	}
	
	// Returns the list of players.
	public List<Player> getPlayers() {
		return players;
	}
	
	/* Register the player for the game. Adds the given player to Players list.
	 * If maximum players reached or the player has already registered, 
	 * then throws Game Exception.
	 */
	public void register(Player player) throws GameException {
		if (players.size() == Cards.MAX_PLAYERS) {
			throw new GameException(
				"No room for more players. " +
				"Maximum number of players have registered for the game. "
			);
		}
		
		if (players.contains(player)) {
			throw new GameException(
				"The player has already registered for the game."
			);
		}
		
		players.add(player);
	}
	
	// Starts the game. If number of players is less than 2, then throws Card Exception.
	public void play() throws Exception {
		if (players.size() < 2) {
			throw new GameException(
				"Insufficient players. Number of registered players " +
				"must be greater than 2."
			);
		}
		
		// distribute the cards among the players.
		distributeCards();
		
		// get highest card of each player.
		List<Card> playersHighestCard = getPlayersHighestCard();
		
		// find the winner.
		Player winner = getWinner(playersHighestCard);
		
		// print the game results.
		printGame(winner, playersHighestCard);
	}
	
	// Shuffle the pack and distribute the cards among the players.
	private void distributeCards() throws CardException {
		packOfCards.shuffle();
		
		for(int cardCount = 0; cardCount < Cards.MAX_CARDS; cardCount++) {
			for(Player p : players) {
				p.addCard(packOfCards.getTopCard());
			}
		}
	}
	
	// Finds and returns the highest card of each player.
	private List<Card> getPlayersHighestCard() {
		List<Card> playersHighestCard = new ArrayList<>(players.size());
		
		for(Player p : players) {
			playersHighestCard.add(p.getHighestCard());
		}
		
		return playersHighestCard;
	}
	
	/* Determines and returns the winner of the game. Winner is the player with the 
	 * highest card among all the players.
	 */
	private Player getWinner(List<Card> playersHighestCard) {
		Integer winner = 0;
		Integer maxValue = playersHighestCard.get(0).getValue();
		
		for(int c = 1; c < playersHighestCard.size(); c++) {
			int curValue = playersHighestCard.get(c).getValue();
			if (curValue > maxValue) {
				maxValue = curValue;
				winner = c;
			}
		}
		
		return players.get(winner);
	}
	
	// Display the game details and the winner.
	private void printGame(Player winner, List<Card> playersHighestCard) {
		System.out.println("WELCOME TO THE POKER CARD GAME");
		
		int lineSize = 50;
		
		System.out.println("\n\nPlayer Details\n");
		for(int i = 0; i < lineSize; i++) 
			System.out.print("-");
		System.out.println("\n");
		
		for(int p = 0; p < players.size(); p++) {
			Card card = playersHighestCard.get(p);
			System.out.println(players.get(p));
			System.out.println("Highest Card = " + card + " (" + card.getValue() + ")\n");
			
			for(int i = 0; i < lineSize; i++) 
				System.out.print("-");
			System.out.println("\n");
		}
		
		// Print winner
		System.out.println("AND THE WINNER IS : " + winner.getName());
	}
}
