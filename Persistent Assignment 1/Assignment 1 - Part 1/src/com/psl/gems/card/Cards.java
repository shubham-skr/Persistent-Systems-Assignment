package com.psl.gems.card;

/*
 * This class creates static final Card representing each of the 52 possible cards.
 * 
 * These cards will be used to initialize the full pack.
 * 
 *  It also creates constants -  
 *  	TOTAL_CARDS - total number of possible cards. 
 *  	MAX_CARDS - maximum cards a player can get in the game.
 *  	MAX_PLAYERS - maximum number of players that can register for a game.
 */

public class Cards {
	// Suits
	private static final Suit CLUB = new Suit("CLUB", 0);
	private static final Suit DIAMOND = new Suit("DIAMOND", 1);
	private static final Suit HEART = new Suit("HEART", 2);
	private static final Suit SPADE = new Suit("SPADE", 3);
	
	// Ranks
	private static final Rank TWO = new Rank("TWO", 0);
	private static final Rank THREE = new Rank("THREE", 1);
	private static final Rank FOUR = new Rank("FOUR", 2);
	private static final Rank FIVE = new Rank("FIVE", 3);
	private static final Rank SIX = new Rank("SIX", 4);
	private static final Rank SEVEN = new Rank("SEVEN", 5);
	private static final Rank EIGHT = new Rank("EIGHT", 6);
	private static final Rank NINE = new Rank("NINE", 7);
	private static final Rank TEN = new Rank("TEN", 8);
	private static final Rank JACK = new Rank("JACK", 9);
	private static final Rank QUEEN = new Rank("QUEEN", 10);
	private static final Rank KING = new Rank("KING", 11);
	private static final Rank ACE = new Rank("ACE", 12);
	
	// Total number of cards
	public static final Integer TOTAL_CARDS = 52;
	
	// Maximum number of cards each player can get
	public static final Integer MAX_CARDS = 3;
	
	// Maximum number of players able to register for an instance of game
	public static final Integer MAX_PLAYERS = 17;
	
	// Club cards 
	public static final Card CLUB_TWO = new Card(CLUB, TWO);
	public static final Card CLUB_THREE = new Card(CLUB, THREE);
	public static final Card CLUB_FOUR = new Card(CLUB, FOUR);
	public static final Card CLUB_FIVE = new Card(CLUB, FIVE);
	public static final Card CLUB_SIX = new Card(CLUB, SIX);
	public static final Card CLUB_SEVEN = new Card(CLUB, SEVEN);
	public static final Card CLUB_EIGHT = new Card(CLUB, EIGHT);
	public static final Card CLUB_NINE = new Card(CLUB, NINE);
	public static final Card CLUB_TEN = new Card(CLUB, TEN);
	public static final Card CLUB_JACK = new Card(CLUB, JACK);
	public static final Card CLUB_QUEEN = new Card(CLUB, QUEEN);
	public static final Card CLUB_KING = new Card(CLUB, KING);
	public static final Card CLUB_ACE = new Card(CLUB, ACE);
	
	// Diamond cards
	public static final Card DIAMOND_TWO = new Card(DIAMOND, TWO);
	public static final Card DIAMOND_THREE = new Card(DIAMOND, THREE);
	public static final Card DIAMOND_FOUR = new Card(DIAMOND, FOUR);
	public static final Card DIAMOND_FIVE = new Card(DIAMOND, FIVE);
	public static final Card DIAMOND_SIX = new Card(DIAMOND, SIX);
	public static final Card DIAMOND_SEVEN = new Card(DIAMOND, SEVEN);
	public static final Card DIAMOND_EIGHT = new Card(DIAMOND, EIGHT);
	public static final Card DIAMOND_NINE = new Card(DIAMOND, NINE);
	public static final Card DIAMOND_TEN = new Card(DIAMOND, TEN);
	public static final Card DIAMOND_JACK = new Card(DIAMOND, JACK);
	public static final Card DIAMOND_QUEEN = new Card(DIAMOND, QUEEN);
	public static final Card DIAMOND_KING = new Card(DIAMOND, KING);
	public static final Card DIAMOND_ACE = new Card(DIAMOND, ACE);
	
	// Heart cards
	public static final Card HEART_TWO = new Card(HEART, TWO);
	public static final Card HEART_THREE = new Card(HEART, THREE);
	public static final Card HEART_FOUR = new Card(HEART, FOUR);
	public static final Card HEART_FIVE = new Card(HEART, FIVE);
	public static final Card HEART_SIX = new Card(HEART, SIX);
	public static final Card HEART_SEVEN = new Card(HEART, SEVEN);
	public static final Card HEART_EIGHT = new Card(HEART, EIGHT);
	public static final Card HEART_NINE = new Card(HEART, NINE);
	public static final Card HEART_TEN = new Card(HEART, TEN);
	public static final Card HEART_JACK = new Card(HEART, JACK);
	public static final Card HEART_QUEEN = new Card(HEART, QUEEN);
	public static final Card HEART_KING = new Card(HEART, KING);
	public static final Card HEART_ACE = new Card(HEART, ACE);
	
	// Spade cards
	public static final Card SPADE_TWO = new Card(SPADE, TWO);
	public static final Card SPADE_THREE = new Card(SPADE, THREE);
	public static final Card SPADE_FOUR = new Card(SPADE, FOUR);
	public static final Card SPADE_FIVE = new Card(SPADE, FIVE);
	public static final Card SPADE_SIX = new Card(SPADE, SIX);
	public static final Card SPADE_SEVEN = new Card(SPADE, SEVEN);
	public static final Card SPADE_EIGHT = new Card(SPADE, EIGHT);
	public static final Card SPADE_NINE = new Card(SPADE, NINE);
	public static final Card SPADE_TEN = new Card(SPADE, TEN);
	public static final Card SPADE_JACK = new Card(SPADE, JACK);
	public static final Card SPADE_QUEEN = new Card(SPADE, QUEEN);
	public static final Card SPADE_KING = new Card(SPADE, KING);
	public static final Card SPADE_ACE = new Card(SPADE, ACE);
}
