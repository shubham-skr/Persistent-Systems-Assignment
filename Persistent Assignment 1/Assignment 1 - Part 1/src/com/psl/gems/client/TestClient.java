package com.psl.gems.client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

import com.psl.gems.card.Card;
import com.psl.gems.game.*;
import com.psl.gems.player.*;

/*
 * This class has methods:
 * 		main              - Simulates the game.
 * 		writeOutputFile   - Writes the game output to cardgame.html file.
 */

public class TestClient {
	public static void main(String[] args) {
		try {
			// Create two players.
			Player player1 = new Player("Suresh");
			Player player2 = new Player("Ramesh");
			
			// Create poker card game.
			PokerCardGame game = new PokerCardGame();
			
			// Register players.
			game.register(player1);
			game.register(player2);
			
			// Play the game.
			game.play();
			
			// Write output to file.
			List<Player> registeredPlayers = game.getPlayers();
			writeOutputFile(registeredPlayers);
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	// Writes the game output the the file.
	public static void writeOutputFile(List<Player> players) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("cardgame.html"))) {
			String output = "<!DOCTYPE html>\n"
						+ "<html lang=\"en\">\n" 
						+ "<head>\n"  
						+ "\t<title>Document</title>\n" 
						+ "</head>\n"  
						+ "<body>\n"  
						+ "\t<section>\n";
			
			for(Player p : players) {
				output += "\t\t<div id=\"" + p.getName() + "\">\n";
				for(Card c : p.getCardsInHand()) {
					output += "\t\t\t<div data-card=\"" + c.toString() + "\" />\n";
				}
				output += "\t\t</div>\n";
			}
				 
			output += "\t</section>\n"
					+ "</body>\n"
					+ "</html>\n";
	
			bw.write(output);
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
