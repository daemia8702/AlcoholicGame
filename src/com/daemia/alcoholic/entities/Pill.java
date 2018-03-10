package com.daemia.alcoholic.entities;

public class Pill extends Items{
	
	public static final int PILL_GAME_POINT = 2;
	public static final int PILL_ALCOHOL_POINT = -1;
	
	public Pill(double posX, double posY, int width, int height) {
		super(posX, posY, width, height);
	}

	@Override
	public String toString() {
		return "Pill [getGamePoint()=" + getGamePoint() + ", getAlcoholPoint()=" + getAlcoholPoint() + ", getPosX()="
				+ getPosX() + ", getPosY()=" + getPosY() + ", getSpeed()=" + getSpeed() + "\r\n";
	}
}
