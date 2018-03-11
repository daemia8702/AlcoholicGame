package com.daemia.alcoholic.entities;

/**
 * The main abstract class for all the falling items in the game
 * @author daemia
 *
 */
public abstract class Items extends Entity{
	
	public static final int WIDTH = 10;
	public static final int HEIGHT = 30;
	
	private int gamePoint;
	private int alcoholPoint;
	
	
	public Items(double posX, double posY, int width, int height) {
		super(posX, posY, width, height);
		this.setSpeed(2.5D);
	}
	
	
	/**
	 * Method for the falling items movement
	 */
	public void move() {
		double y = this.getPosY();
    	y += this.getSpeed();
    	
    	this.setPosY(y);
	}
	
	// Getters and setters for the fields
	public int getGamePoint() {
		return gamePoint;
	}

	public void setGamePoint(int gamePoint) {
		this.gamePoint = gamePoint;
	}

	public int getAlcoholPoint() {
		return alcoholPoint;
	}

	public void setAlcoholPoint(int alcoholPoint) {
		this.alcoholPoint = alcoholPoint;
	}
	
}
