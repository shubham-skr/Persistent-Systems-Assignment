package com.psl.gems.card;

/*
* This class represents the Rank of the card.  
* 
* A Rank has name and weight attributes.
* 
* Rank can be TWO, THREE, ..., TEN, JACK, QUEEN, KING, ACE and their weights 
* will be 0, 1, ..., 12.
*/

public class Rank {
	private String name;
	private Integer weight;
	
	public Rank(String name, Integer weight) {
		this.name = name;
		this.weight = weight;
	}
	
	// Returns the name of the rank
	public String getName() {
		return name;
	}
	
	// Returns the weight of the rank
	public Integer getWeight() {
		return weight;
	}
}
