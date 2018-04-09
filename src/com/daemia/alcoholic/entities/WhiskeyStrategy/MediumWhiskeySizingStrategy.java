package com.daemia.alcoholic.entities.WhiskeyStrategy;

public class MediumWhiskeySizingStrategy implements WhiskeySizingStrategy {
	
	private final int WIDTH = 10;
	private final int HEIGHT = 25;
	
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
		return "MediumWhiskeySizingStrategy [WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + "]";
	}

}
