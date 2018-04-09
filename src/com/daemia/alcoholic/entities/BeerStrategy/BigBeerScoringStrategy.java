package com.daemia.alcoholic.entities.BeerStrategy;

public class BigBeerScoringStrategy implements BeerScoringStrategy {
	
	private final int GAMEPOINT = 4;
	private final int ALCOHOLPOINT = 2;
	
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
		return "BigBeerScoringStrategy [GAMEPOINT=" + GAMEPOINT + ", ALCOHOLPOINT=" + ALCOHOLPOINT + "]";
	}
	
}
