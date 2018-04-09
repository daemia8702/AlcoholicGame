package com.daemia.alcoholic.entities.BeerStrategy;

public class SmallBeerSizingStrategy implements BeerSizingStrategy {
	
	private final int WIDTH = 5;
	private final int HEIGHT = 10;
	
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
		return "SmallBeerSizingStrategy [WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + "]";
	}
	
}
