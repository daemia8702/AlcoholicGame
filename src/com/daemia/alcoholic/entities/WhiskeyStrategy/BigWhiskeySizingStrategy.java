package com.daemia.alcoholic.entities.WhiskeyStrategy;

public class BigWhiskeySizingStrategy implements WhiskeySizingStrategy {
	
	private final int WIDTH = 10;
	private final int HEIGHT = 30;
	
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
		return "BigWhiskeySizingStrategy [WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + "]";
	}
}
