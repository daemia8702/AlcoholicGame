package com.daemia.alcoholic.entities;

import Testing.Game;

public class Player extends Entity{

	public final static int PLAYER_WIDTH = 100;
	public final static int PLAYER_HEIGHT = 5;
	public final static double PLAYER_Y_POSITION = 440;
	
	private final double MODERATE_DRUNK = 5.5D;
	private final double VERY_DRUNK = 6.5D;
	private final double STARTING_SPEED = 3.5D;
	
	//private double playerSpeed;
	private String playerName;
	private int gameScore;
	private int alcoholLevel;
	
	
	public Player(double posX, double playerSpeed) {
		super(posX, PLAYER_Y_POSITION, playerSpeed, PLAYER_WIDTH, PLAYER_HEIGHT);
		gameScore = 0;
		alcoholLevel = 0;
	}
	
	/**
	 * Method for the player movement
	 * This'll be the normal movement, if the player is sober, or not so drunk
	 * In this phase the player is moving back and forth on the screen. (just for testing)
	 */
	
	// Later this method can be deleted
	private void drunkMovement(double increaseSpeed) {
		
		double xPosition = getPosX();
		
		
		xPosition += getSpeed();
		setPosX(xPosition);
		
		if (xPosition < 0) {
			setSpeed(increaseSpeed);
		}
		
		if (xPosition > Game.WIDTH - PLAYER_WIDTH) {
			setSpeed(increaseSpeed * -1);
		}
	}
	
	/**
	 * Movements if player getting drunk.
	 * If player has a low alcohol level it can move like normal
	 * On the first stage player gets slower
	 * On the second stage player jumps positions
	 * On the third stage player get's confused
	 */
	
	public void move() {
		
		if (alcoholLevel <= 10) {
			drunkMovement(STARTING_SPEED);
		}
		else if (alcoholLevel > 10 && alcoholLevel <= 15) {
			drunkMovement(MODERATE_DRUNK);
		}
		else if (alcoholLevel > 15 && alcoholLevel <= 20) {
			drunkMovement(VERY_DRUNK);
		}
		else if (alcoholLevel > 20) {
			/*
			 	Switch the input: if left arrow is pressed player goes right,
			 	if right arrow is pressed player goes left.
			 */
		}
	}
	
	// Getters and setters for the fields
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore += gameScore;
	}

	public int getAlcoholLevel() {
		return alcoholLevel;
	}

	public void setAlcoholLevel(int alcoholLevel) {
		this.alcoholLevel += alcoholLevel;
	}

	@Override
	public String toString() {
		return "Player [getGameScore()=" + getGameScore() + ", getAlcoholLevel()=" + getAlcoholLevel() + ", getPosX()="
				+ getPosX() + ", getPosY()=" + getPosY() + ", getSpeed()=" + getSpeed() + "]" + "\r\n";
	}

	
}
