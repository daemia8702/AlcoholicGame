package com.daemia.alcoholic.entities.BeerStrategy;

public class SmallBeerScoringStrategy implements BeerScoringStrategy {
	
	private final int GAMEPOINT = 2;
	private final int ALCOHOLPOINT = 1;
	
	@Override
	public int getGamePoint() {
		return GAMEPOINT;
	}

	@Override
	public int getAlcoholPoint() {
		return ALCOHOLPOINT;
	}

	@Override
	public String toString() {
		return "SmallBeerScoringStrategy [GAMEPOINT=" + GAMEPOINT + ", ALCOHOLPOINT=" + ALCOHOLPOINT + "]";
	}
	
}
