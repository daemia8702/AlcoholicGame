package com.daemia.alcoholic.entities.BeerStrategy;

import com.daemia.alcoholic.entities.Items;

public class Beer extends Items{
	
	private BeerMovingStrategy beerMoving;
	private BeerScoringStrategy beerScoring;
	private BeerSizingStrategy beerSizing;
	
	public Beer(double posX, double posY, double speed, BeerMovingStrategy beerMoving, BeerScoringStrategy beerScoring, BeerSizingStrategy beerSizing) {
		super(posX, posY, speed);
		this.beerMoving = beerMoving;
		this.beerScoring = beerScoring;
		this.beerSizing = beerSizing;
	}
	

	@Override
	public void move() {
		beerMoving.move(this);
	}

	@Override
	public int getAlcoholPoint() {
		return this.beerScoring.getAlcoholPoint();
	}

	@Override
	public int getGamePoint() {
		return this.beerScoring.getGamePoint();
	}

	@Override
	public int getWidth() {
		return this.beerSizing.getWidth();
	}

	@Override
	public int getHeight() {
		return this.beerSizing.getHeight();
	}


	@Override
	public String toString() {
		return "Beer [beerMoving=" + beerMoving + ", beerScoring=" + beerScoring + ", beerSizing=" + beerSizing + "]" + "\r\n";
	}
	
}