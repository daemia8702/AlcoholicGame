package com.daemia.alcoholic.entities.WhiskeyStrategy;

public class SmallWhiskeySizingStrategy implements WhiskeySizingStrategy {
	
	private final int WIDTH = 10;
	private final int HEIGHT = 15;
	
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
		return "SmallWhiskeySizingStrategy [WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + "]";
	}
	
}
