package com.daemia.alcoholic.entities.WhiskeyStrategy;

import com.daemia.alcoholic.entities.Entity;

public class RegularWhiskeyMovingStrategy implements WhiskeyMovingStrategy {
	private double posY;
	public void move(Entity entity) {
		posY = entity.getPosY();
		
		posY += entity.getSpeed();
		entity.setPosY(posY);
	}
	@Override
	public String toString() {
		return "RegularWhiskeyMovingStrategy [posY=" + posY + "]";
	}
	
}
