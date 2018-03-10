package com.daemia.alcoholic.entities;

public class Beer extends Items{
	
	public static final int BEER_GAME_POINT = 10;
	public static final int BEER_ALCOHOL_POINT = 2;

	
	public Beer(double posX, double posY, int width, int height) {
		super(posX, posY, width, height);
	}


	@Override
	public String toString() {
		return "Beer [getGamePoint()=" + getGamePoint() + ", getAlcoholPoint()=" + getAlcoholPoint() + ", getPosX()="
				+ getPosX() + ", getPosY()=" + getPosY() + ", getSpeed()=" + getSpeed() + "\r\n";
	}
}
