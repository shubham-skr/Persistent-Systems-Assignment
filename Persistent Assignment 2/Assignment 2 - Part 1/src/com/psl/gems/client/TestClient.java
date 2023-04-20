package com.psl.gems.client;

import java.io.*;
import com.psl.gems.card.*;

public class TestClient {
	public static void main(String[] args) {
		// Create the full pack 
		PackOfCards fullpack = new PackOfCards();
		
		// Shuffle the full pack 
		fullpack.shuffle();
		
		// Print the full pack as JSON in file
		try (BufferedWriter br = new BufferedWriter(new FileWriter("pack-of-cards.json"))) {
			br.write("[\n");
			int i = fullpack.getSize();
			for (Card card : fullpack.getFullPack()) {
				br.write("\t" + card.getJsonString() + ((--i == 0)? "":",") + "\n");
			}
			br.write("]");
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
