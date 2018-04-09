package com.daemia.alcoholic.entities;

/**
 * The base abstract class for all the entities (player and falling items) in the game.
 * @author daemia
 *
 */
public abstract class Entity {
	
	private double posX;
	private double posY;
	private double speed;
	private int width;
	private int height;
	
	public Entity(double posX, double posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public Entity(double posX, double posY, double speed) {
		this(posX, posY);
		this.speed = speed;
	}
	
	public Entity(double posX, double posY, double speed, int width, int height) {
		this(posX, posY, speed);
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
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

}
