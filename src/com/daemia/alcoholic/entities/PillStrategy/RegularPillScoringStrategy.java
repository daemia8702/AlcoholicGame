package com.daemia.alcoholic.entities.PillStrategy;

public class RegularPillScoringStrategy implements PillScoringStrategy {
	
	private final int GAMEPOINT =  2;
	private final int ALCOHOLPOINT = -2;
	
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
		return "RegularPillScoringStrategy [GAMEPOINT=" + GAMEPOINT + ", ALCOHOLPOINT=" + ALCOHOLPOINT + "]";
	}
	
}
