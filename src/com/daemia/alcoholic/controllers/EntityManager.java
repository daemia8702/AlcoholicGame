package com.daemia.alcoholic.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.daemia.alcoholic.entities.Entity;
import com.daemia.alcoholic.entities.Items;
import com.daemia.alcoholic.entities.Player;

import Testing.Game;
/**
 * The class main purpose is to build a bridge between the model classes of the game, and the view classes of the game
 * @author daemia
 *
 */
public class EntityManager {
	
	// FIELDS
	private Entity player;
	private List<Items> itemsList;
	private ItemFactory factory;
	private Random rand;

	
	//CONSTRUCTOR
	public EntityManager() {
		itemsList = new LinkedList<>();
		rand = new Random();
		factory = new ItemFactory();
	}
	
	
	/**
	 * This helper method is used for selecting an item from the FallingItems enum
	 * @return a random FallingItem from the itemsArray
	 */
	private FallingItems selectFallingItem() {
		FallingItems[] itemsArray = FallingItems.values();
		
		int randomIndex = rand.nextInt(itemsArray.length);
		
		return itemsArray[randomIndex];
	}
	
	/**
	 * The method is creating an item with the help of the ItemFactory class
	 * @return an item created by the ItemFactory class at a random x and y coordinate random place on the screen
	 */
	private Items produceItem() {
		
		Entity product = this.factory.getItems(30, -50, selectFallingItem());
		
		return (Items) product;
	}
	
	/**
	 * Creates the player at a random x coordinate on the screen
	 */
	public void createPlayer() {
		player = this.factory.getPlayer(rand.nextInt(Game.WIDTH));
	}
	
	/**
	 * Updloads the LinkedList entityList with the items
	 * @param numsOfItems decides how many items should be in the list
	 */
	public void uploadList(int numsOfItems) {
		for(int i = 0; i < numsOfItems; i++) {
			itemsList.add(produceItem());
		}
		
	}
	
	/**
	 * The method is used for adding a new entity to the entity list if an entity is collected by the player
	 */
	public void addItem() {
		itemsList.add(produceItem());
	}
	
	// Getters for the entityList and for the player
	public List<Items> getItemsList() {
		return itemsList;
	}
	
	public Player getPlayer() {
		return (Player) player;
	}
}
