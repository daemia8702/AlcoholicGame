package com.daemia.alcoholic.entities.WhiskeyStrategy;

public class MediumWhiskeyScoringStrategy implements WhiskeyScoringStrategy {

	private final int GAMEPOINT = 4;
	private final int ALCOHOLPOINT = 4;
	
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
		return "MediumWhiskeyScoringStrategy [GAMEPOINT=" + GAMEPOINT + ", ALCOHOLPOINT=" + ALCOHOLPOINT + "]";
	}
}
