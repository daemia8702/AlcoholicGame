package com.daemia.alcoholic.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.daemia.alcoholic.entities.Entity;
import com.daemia.alcoholic.entities.Items;
import com.daemia.alcoholic.entities.Player;

import Testing.Game;

public class EntityManager {
	
	private List<Entity> entityList;
	private ItemFactory factory;
	private Random rand;
	private Player player;
	
	public EntityManager() {
		entityList = new LinkedList<>();
		rand = new Random();
		factory = new ItemFactory();
		player = new Player(rand.nextDouble() * (Game.WIDTH - Player.PLAYER_WIDTH), Player.PLAYER_Y_POSITION, Player.PLAYER_WIDTH, Player.PLAYER_HEIGHT);
	}
	
	/**
	 * @return a random FallingItem from the itemsArray
	 */
	private FallingItems selectFallingItem() {
		FallingItems[] itemsArray = FallingItems.values();
		
		int randomIndex = rand.nextInt(itemsArray.length);
		
		return itemsArray[randomIndex];
	}
	/**
	 * @return an item created by the ItemFactory class at a random place on the screen
	 */
	private Entity produceItem() {
		return factory.getItems(rand.nextDouble() * (Game.WIDTH - Items.WIDTH) + 15 , rand.nextDouble() 
				* (Game.HEIGHT - Items.HEIGHT)-520, selectFallingItem());
	}
	
	public void uploadList(int numsOfItems) {
		for(int i = 0; i < numsOfItems; i++) {
			entityList.add(produceItem());
		}
	}
	
	public void updateEntityPosition() {
		for (int i = 0; i < entityList.size(); i++) {
			entityList.get(i).move();
			
			if (entityList.get(i).getPosY() > Game.HEIGHT) {
				entityList.get(i).setPosY(rand.nextDouble() *  Game.HEIGHT - Game.HEIGHT);
				entityList.get(i).setPosX(rand.nextDouble() * (Game.WIDTH - Items.WIDTH) - 5);
			}
		}
		
	}
	
	public boolean detectCollision() {
		boolean isCollided = false;
		
		for (int i = 0; i < entityList.size(); i++) {
			if ((player.getPosX() == entityList.get(i).getPosX()) && (player.getPosY() == entityList.get(i).getPosY())) {
				isCollided = true;
			} 
		}
		return true;
	}
	
	public void addEntity() {
		entityList.add(produceItem());
	}
	
	public List<Entity> getEntityList() {
		return entityList;
	}
	
	// for testing
	public Player getPlayer() {
		return player;
	}
	
}
