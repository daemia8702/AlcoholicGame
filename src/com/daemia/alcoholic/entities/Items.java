package com.daemia.alcoholic.entities;

/**
 * The main abstract class for all the falling items in the game
 * @author daemia
 *
 */
public abstract class Items extends Entity{
	
	public Items(double posX, double posY, double speed) {
		super(posX, posY, speed);
	}
	
	public abstract int getAlcoholPoint();
	public abstract int getGamePoint();
	
}
