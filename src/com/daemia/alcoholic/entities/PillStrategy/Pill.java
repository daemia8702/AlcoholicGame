package com.daemia.alcoholic.entities.PillStrategy;

import com.daemia.alcoholic.entities.Items;

public class Pill extends Items{
	
	private PillMovingStrategy pillMoving;
	private PillScoringStrategy pillScoring;
	private PillSizingStrategy pillSizing;
	
	public Pill(double posX, double posY, double speed, PillMovingStrategy pillMoving, 
			PillScoringStrategy pillScoring, PillSizingStrategy pillSizing) {
		
		super(posX, posY, speed);
		this.pillMoving = pillMoving;
		this.pillScoring = pillScoring;
		this.pillSizing = pillSizing;
	}
	
	@Override
	public void move() {
		pillMoving.move(this);
	}
	
	@Override
	public int getAlcoholPoint() {
		return this.pillScoring.getAlcoholPoint();
	}

	@Override
	public int getGamePoint() {
		return this.pillScoring.getGamePoint();
	}

	@Override
	public int getWidth() {
		return this.pillSizing.getWidth();
	}

	@Override
	public int getHeight() {
		return this.pillSizing.getHeight();
	}

	@Override
	public String toString() {
		return "Pill [pillMoving=" + pillMoving + ", pillScoring=" + pillScoring + ", pillSizing=" + pillSizing + "]" + "\r\n";
	}

}
