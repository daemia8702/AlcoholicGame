package com.daemia.alcoholic.entities.PillStrategy;

import com.daemia.alcoholic.entities.Entity;

public class RegularPillMovingStrategy implements PillMovingStrategy {
	private double posY;
	
	public void move(Entity entity) {
		posY = entity.getPosY();
		
		posY += entity.getSpeed();
		entity.setPosY(posY);
	}

	@Override
	public String toString() {
		return "RegularPillMovingStrategy [posY=" + posY + "]";
	}
	
}
