package com.daemia.alcoholic.entities.BeerStrategy;

public class BigBeerSizingStrategy implements BeerSizingStrategy {
	
	private final int WIDTH = 5;
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
		return "BigBeerSizingStrategy [WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + "]";
	}
	
}
