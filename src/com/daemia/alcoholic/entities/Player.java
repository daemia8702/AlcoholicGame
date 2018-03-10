package com.daemia.alcoholic.entities;

import Testing.Game;

public class Player extends Entity{

	public static final int PLAYER_WIDTH = 100;
	public static final int PLAYER_HEIGHT = 5;
	public static final int PLAYER_Y_POSITION = 440;
	
	private String playerName;
	private int gameScore;
	private int alcoholLevel;
	private double xMove;
	
	public Player(double posX, double posY, int width, int height) {
		super(posX, PLAYER_Y_POSITION, PLAYER_WIDTH, PLAYER_HEIGHT);
		gameScore = 0;
		alcoholLevel = 0;
		xMove = 3.5D;
	}
	
	/**
	 * Method for the player movement
	 */
	public void move() {
		double x = this.getPosX();
		
		x += xMove;
		this.setPosX(x);
		
		if(x <= 0) {
			xMove = 3.5D;
		}
		if (x > Game.WIDTH - PLAYER_WIDTH) {
			xMove = -3.5D;
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
		return "Player [playerName=" + playerName + ", gameScore=" + gameScore + ", alcoholLevel=" + alcoholLevel
				+ ", xMove=" + xMove + ", getGameScore()=" + getGameScore() + ", getAlcoholLevel()=" + getAlcoholLevel()
				+ ", getPosX()=" + getPosX() + "]\r\n";
	}
	
	
}
