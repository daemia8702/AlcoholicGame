package com.daemia.alcoholic.entities;

public class Whiskey extends Items{
	
	public static final int WHISKEY_GAME_POINT = 15;
	public static final int WHISKEY_ALCOHOL_POINT = 5;
	
	public Whiskey(double posX, double posY, int width, int height) {
		super(posX, posY, width, height);
	}

	@Override
	public String toString() {
		return "Whiskey [getGamePoint()=" + getGamePoint() + ", getAlcoholPoint()=" + getAlcoholPoint() + ", getPosX()="
				+ getPosX() + ", getPosY()=" + getPosY() + ", getSpeed()=" + getSpeed() + "\r\n";
	}
	
	
}