package States;

import com.daemia.alcoholic.controllers.EntityManager;
import com.daemia.alcoholic.entities.Beer;
import com.daemia.alcoholic.entities.Pill;
import com.daemia.alcoholic.entities.Whiskey;
/**
 * This class implements the main game logic with the help of the EntityManager class.
 * @author daemia
 *
 */
public class GameState {
	
	private EntityManager manager;
	private int notCollected;
	private int numOfItems; 
	
	public GameState() {
		manager = new EntityManager();
		manager.uploadList(25);// 25 items just for testing
		notCollected = 0;
	}
	
	/**
	 * The method is used for count the players score if collision with an item is detected.
	 * If an item is collected by the player, than the player gets the games core of that item, and gets drunk
	 */
	private void updatePlayerScore() {
		if (manager.detectCollision()) {
			for (int i = 0; i < manager.getEntityList().size(); i++) {
				if (manager.getEntityList().get(i) instanceof Beer) {
					manager.getPlayer().setAlcoholLevel(Beer.BEER_ALCOHOL_POINT);
					manager.getPlayer().setGameScore(Beer.BEER_GAME_POINT);
					manager.getEntityList().remove(i);
				}
				else if (manager.getEntityList().get(i) instanceof Whiskey) {
					manager.getPlayer().setAlcoholLevel(Whiskey.WHISKEY_ALCOHOL_POINT);
					manager.getPlayer().setGameScore(Whiskey.WHISKEY_GAME_POINT);
					manager.getEntityList().remove(i);
				}
				else if (manager.getEntityList().get(i) instanceof Pill) {
					manager.getPlayer().setAlcoholLevel(Pill.PILL_ALCOHOL_POINT);
					manager.getPlayer().setGameScore(Pill.PILL_GAME_POINT);
					manager.getEntityList().remove(i);
				}
			}
			manager.addEntity();
		} else {
			manager.getPlayer().setGameScore(-2);
			notCollected++;
			if (manager.getPlayer().getGameScore() < 0) {
				manager.getPlayer().setGameScore(0);
			}
		}
	}
	
	/**
	 * The method is used for speed up the items based on the player's game score.
	 * If the player's game score is increasing then the item's speed is increasing too.
	 */
	private void setItemSpeed() {
		for (int i = 0; i < manager.getEntityList().size(); i++) {
			if (manager.getPlayer().getGameScore() > 20 && manager.getPlayer().getGameScore() <= 50) {
				manager.getEntityList().get(i).setSpeed(5.5D);
			}
			else if (manager.getPlayer().getGameScore() > 50 && manager.getPlayer().getGameScore() <= 80) {
				manager.getEntityList().get(i).setSpeed(8.5D);
			}
			else if (manager.getPlayer().getGameScore() > 80 && manager.getPlayer().getGameScore() <= 100) {
				manager.getEntityList().get(i).setSpeed(10.5D);
			}
		}
	}
	
	/**
	 * Updates all the entities and their attributes
	 */
	public void update() {
		manager.getPlayer().move();
		manager.updateEntityPosition();
		updatePlayerScore();
		setItemSpeed();
	}
	
	/**
	 * Decides whether the game is ended or not
	 * @return false if the int notCollected <= 10, true if notCollected > 10 
	 */
	public boolean isGameEnded() {
		return notCollected > 10;
	}
	
	/*
	 Method that has to be implemented later:
	 public void render(Graphics g)
	 */
	
	// for testing
	public EntityManager getManager() {
		return manager;
	}
	
	public int getNotCollected() {
		return notCollected;
	}
}
