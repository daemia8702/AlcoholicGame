package com.daemia.alcoholic.states;

import com.daemia.alcoholic.controllers.EntityManager;
import com.daemia.alcoholic.entities.Items;
import com.daemia.alcoholic.entities.BeerStrategy.Beer;
import com.daemia.alcoholic.entities.PillStrategy.Pill;
import com.daemia.alcoholic.entities.WhiskeyStrategy.Whiskey;

import Testing.Game;
/**
 * This class implements the main game logic with the help of the EntityManager class.
 * @author daemia
 */
public class GameState {
	
	private final int MAX_NOT_COLLECTED_ITEMS = 10;
	private final int PENALTY_POINT = -2;
	private final int LEVEL_ONE_SCORE = 20;
	private final int LEVEL_TWO_SCORE = 50;
	private final int LEVEL_THREE_SCORE = 80;
	
	private final double LEVEL_TWO_SPEED = 1.5D;
	private final double LEVEL_THREE_SPEED = 1.8D;
	private final double LEVEL_FOUR_SPEED = 2.3D;
	
	
	private EntityManager manager;
	private int notCollected;
	private int numOfItems;// this field will be used later to decide how many items to be on a level 

	
	public GameState() {
		manager = new EntityManager();
		manager.createPlayer();
		manager.uploadList(1);
		notCollected = 0;
		numOfItems = 10;
	}
	
	/**
	 * Updating the falling items position, using the entity class move method. If the item is not collected and goes off the screen,
	 * this method is replacing the falling item offscreen with a random negative posY value
	 */
	public void updateEntityPosition() {
			
			for (int i = 0; i < manager.getItemsList().size(); i++) {
				manager.getItemsList().get(i).move();
				
				if (manager.getItemsList().get(i).getPosY() > Game.HEIGHT) {
					/*int yPositionOffset = -120;
					int positionY = rand.nextInt() + yPositionOffset;*/
					manager.getItemsList().get(i).setPosY(-10);
				}
			}
		}
	
	
	/**
	 * Method for the collision detection
	 * @return true if the falling item and the player are colliding
	 */
	public void collisionDetection() {
		
		for (int i = 0; i < manager.getItemsList().size(); i++) {
			if ((manager.getItemsList().get(i).getPosY() + manager.getItemsList().get(i).getHeight() >= manager.getPlayer().getPosY()) && 
					(manager.getItemsList().get(i).getPosX() + manager.getItemsList().get(i).getWidth() >= manager.getPlayer().getPosX() && 
							manager.getItemsList().get(i).getPosX() + manager.getItemsList().get(i).getWidth() <= manager.getPlayer().getPosX() 
							+ manager.getPlayer().getWidth())) {
				
				this.updatePlayerScoreIfItemCatched(manager.getItemsList().get(i));
				System.out.println("COLLISION WITH " + manager.getItemsList().get(i));
				manager.getItemsList().remove(i);
				manager.addItem();
				
			} else if ((manager.getItemsList().get(i).getPosX() + manager.getItemsList().get(i).getHeight() >= manager.getPlayer().getPosY()) &&
						(manager.getItemsList().get(i).getPosX() + manager.getItemsList().get(i).getWidth() <= manager.getPlayer().getPosX() || 
							manager.getItemsList().get(i).getPosX() + manager.getItemsList().get(i).getWidth() >= manager.getPlayer().getPosX() 
							+ manager.getPlayer().getWidth())) {
				
				this.updatePlayerScoreIfItemNotCatched();
				System.out.println(manager.getItemsList().get(i) + " ITEM NOT COLLECTED!!!!!!!");
			} 
		}
		
		return;
	}
	
	/**
	 * This method decides the falling speed of the items. If the player steps up a level, 
	 * based on the players game score, the items speed are increasing
	 */
	public void setGameLevel() {
		// The player is on LEVEL 1
		
		//manager.uploadList(numOfItems);
		
		// The player is on LEVEL 2
		if (manager.getPlayer().getGameScore() > this.LEVEL_ONE_SCORE && manager.getPlayer().getGameScore() <= this.LEVEL_TWO_SCORE) {
			this.numOfItems += 5;
			manager.uploadList(numOfItems);
			for (Items i : manager.getItemsList()) {
				i.setSpeed(LEVEL_TWO_SPEED);
			}
			
		}
		// The player is on LEVEL 3
		else if (manager.getPlayer().getGameScore() > this.LEVEL_TWO_SCORE 
				&& manager.getPlayer().getGameScore() <= this.LEVEL_THREE_SCORE) {
			this.numOfItems += 5;
			manager.uploadList(numOfItems);
			for (Items i : manager.getItemsList()) {
				i.setSpeed(this.LEVEL_THREE_SPEED);
			}
		}
		// The player is on LEVEL 4
		else if (manager.getPlayer().getGameScore() > this.LEVEL_THREE_SCORE) {
			this.numOfItems += 10;
			manager.uploadList(numOfItems);
			for (Items i : manager.getItemsList()) {
				i.setSpeed(this.LEVEL_FOUR_SPEED);
			}
		}
	}
	
	/**
	 * Updates the player's score based on the collected item's games core
	 * @param item The item the player collects
	 */
	private void updatePlayerScoreIfItemCatched(Items item) {
		manager.getPlayer().setAlcoholLevel(item.getAlcoholPoint());
		manager.getPlayer().setGameScore(item.getGamePoint());
	}
	
	/**
	 * Adds a penalty point, if the player can't catch an item
	 */
	private void updatePlayerScoreIfItemNotCatched() {
		manager.getPlayer().setGameScore(this.PENALTY_POINT);
		++notCollected;
	}
	
	/**
	 * Updates all the entities and their attributes
	 */
	public void update() {
		manager.getPlayer().move();
		updateEntityPosition();
		collisionDetection();
		setGameLevel();
	}
	
	/**
	 * Decides whether the game is ended or not
	 * @return false if the int notCollected <= 10, true if notCollected > 10 
	 */
	public boolean isGameEnded() {
		return notCollected > this.MAX_NOT_COLLECTED_ITEMS;
	}
	
	/*
	 Method that has to be implemented later:
	 public void render(Graphics g){}
	 */
	
	public EntityManager getManager() {
		return manager;
	}

	@Override
	public String toString() {
		return "GameState [notCollected=" + notCollected + ", isGameEnded()=" + isGameEnded() + "]";
	}
}
