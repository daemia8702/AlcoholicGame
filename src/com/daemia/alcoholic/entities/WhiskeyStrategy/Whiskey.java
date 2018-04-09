package com.daemia.alcoholic.entities.WhiskeyStrategy;

import com.daemia.alcoholic.entities.Items;

public class Whiskey extends Items{
	
	private WhiskeyMovingStrategy whiskeyMoving;
	private WhiskeyScoringStrategy whiskeyScoring;
	private WhiskeySizingStrategy whiskeySizing;
	
	public Whiskey(double posX, double posY, double speed, WhiskeyMovingStrategy whiskeyMoving, 
			WhiskeyScoringStrategy whiskeyScoring, WhiskeySizingStrategy whiskeySizing) {
		
		super(posX, posY, speed);
		this.whiskeyMoving = whiskeyMoving;
		this.whiskeyScoring = whiskeyScoring;
		this.whiskeySizing = whiskeySizing;
	}
	
	@Override
	public void move() {
		whiskeyMoving.move(this);
	}
	
	@Override
	public int getAlcoholPoint() {
		return this.whiskeyScoring.getAlcoholPoint();
	}

	@Override
	public int getGamePoint() {
		return this.whiskeyScoring.getGamePoint();
	}

	@Override
	public int getWidth() {
		return this.whiskeySizing.getWidth();
	}

	@Override
	public int getHeight() {
		return this.whiskeySizing.getHeight();
	}

	@Override
	public String toString() {
		return "Whiskey [whiskeyMoving=" + whiskeyMoving + ", whiskeyScoring=" + whiskeyScoring + ", whiskeySizing="
				+ whiskeySizing + "]" + "\r\n";
	}
	
}