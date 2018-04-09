package com.daemia.alcoholic.entities.PillStrategy;

public class RegularPillSizingStrategy implements PillSizingStrategy {
	
	private final int WIDTH = 5;
	private final int HEIGHT = 5;
	
	@Override
	public int getWidth() {
		return WIDTH;
	}

	@Override
	public int getHeight() {
		return HEIGHT;
	}

	@Override
	public String toString() {
		return "RegularPillSizingStrategy [WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + "]";
	}
	
}
