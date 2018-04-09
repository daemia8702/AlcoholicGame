package com.daemia.alcoholic.entities.WhiskeyStrategy;

public class SmallWhiskeyScoringStrategy implements WhiskeyScoringStrategy {
	
	private final int GAMEPOINT = 3;
	private final int ALCOHOLPOINT = 3;
	
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
		return "SmallWhiskeyScoringStrategy [GAMEPOINT=" + GAMEPOINT + ", ALCOHOLPOINT=" + ALCOHOLPOINT + "]";
	}
	
}
