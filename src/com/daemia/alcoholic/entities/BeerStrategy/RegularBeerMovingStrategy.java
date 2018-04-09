package com.daemia.alcoholic.entities.BeerStrategy;

import com.daemia.alcoholic.entities.Entity;

public class RegularBeerMovingStrategy implements BeerMovingStrategy{
	private double posY;
	
	public void move(Entity entity) {
		posY = entity.getPosY();
		
		posY += entity.getSpeed();
		entity.setPosY(posY);
	}

	@Override
	public String toString() {
		return "RegularBeerMovingStrategy [posY=" + posY + "]";
	}
}
