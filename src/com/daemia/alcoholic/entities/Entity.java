package com.daemia.alcoholic.entities;

/**
 * The base abstract class for all the entities (player and falling items) in the game.
 * @author daemia
 *
 */
public abstract class Entity {
	
	private double posX;
	private double posY;
	private int width;
	private int height;
	private double speed;
	
	public Entity(double posX, double posY, int width, int height) {
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * This abstract method is for the game entities movement
	 */
	public abstract void move();
	
	// Getters and setters for the fields
	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	

}
