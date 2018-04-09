package com.daemia.alcoholic.entities.WhiskeyStrategy;

public class BigWhiskeyScoringStrategy implements WhiskeyScoringStrategy {
	
	private final int GAMEPOINT = 8;
	private final int ALCOHOLPOINT = 5;
	
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
		return "BigWhiskeyScoringStrategy [GAMEPOINT=" + GAMEPOINT + ", ALCOHOLPOINT=" + ALCOHOLPOINT + "]";
	}
}
