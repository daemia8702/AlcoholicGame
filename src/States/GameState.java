package States;

import com.daemia.alcoholic.controllers.EntityManager;
import com.daemia.alcoholic.entities.Beer;
import com.daemia.alcoholic.entities.Pill;
import com.daemia.alcoholic.entities.Player;
import com.daemia.alcoholic.entities.Whiskey;

public class GameState {
	
	private EntityManager manager;
	private Player player;
	//private int numOfItems;
	private int notCollected;
	
	
	public GameState() {
		manager = new EntityManager();
		player = manager.getPlayer();
		manager.uploadList(25);
		notCollected = 0;
	}
	
	private void updatePlayerScore() {
		if (manager.detectCollision()) {
			for (int i = 0; i < manager.getEntityList().size(); i++) {
				if (manager.getEntityList().get(i) instanceof Beer) {
					player.setAlcoholLevel(Beer.BEER_ALCOHOL_POINT);
					player.setGameScore(Beer.BEER_GAME_POINT);
					manager.getEntityList().remove(i);
				}
				else if (manager.getEntityList().get(i) instanceof Whiskey) {
					player.setAlcoholLevel(Whiskey.WHISKEY_ALCOHOL_POINT);
					player.setGameScore(Whiskey.WHISKEY_GAME_POINT);
					manager.getEntityList().remove(i);
				}
				else if (manager.getEntityList().get(i) instanceof Pill) {
					player.setAlcoholLevel(Pill.PILL_ALCOHOL_POINT);
					player.setGameScore(Pill.PILL_GAME_POINT);
					manager.getEntityList().remove(i);
				}
			}
			manager.addEntity();
		} else {
			player.setGameScore(-2);
			notCollected++;
			if (player.getGameScore() < 0) {
				player.setGameScore(0);
			}
		}
	}
	
	private void setItemSpeed() {
		for (int i = 0; i < manager.getEntityList().size(); i++) {
			if (player.getGameScore() > 20 && player.getGameScore() <= 50) {
				manager.getEntityList().get(i).setSpeed(5.5D);
			}
			else if (player.getGameScore() > 50 && player.getGameScore() <= 80) {
				manager.getEntityList().get(i).setSpeed(8.5D);
			}
			else if (player.getGameScore() > 80 && player.getGameScore() <= 100) {
				manager.getEntityList().get(i).setSpeed(10.5D);
			}
		}
	}
	
	public void update() {
		player.move();
		manager.updateEntityPosition();
		updatePlayerScore();
		setItemSpeed();
	}
	
	public boolean isGameEnded() {
		return notCollected > 10;
	}
	
	// for testing
	public EntityManager getManager() {
		return manager;
	}
	
	public int getNotCollected() {
		return notCollected;
	}
}
