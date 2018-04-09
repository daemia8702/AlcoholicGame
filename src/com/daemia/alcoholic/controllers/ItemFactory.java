package com.daemia.alcoholic.controllers;



import com.daemia.alcoholic.entities.Entity;
import com.daemia.alcoholic.entities.Player;
import com.daemia.alcoholic.entities.BeerStrategy.Beer;
import com.daemia.alcoholic.entities.BeerStrategy.BigBeerScoringStrategy;
import com.daemia.alcoholic.entities.BeerStrategy.BigBeerSizingStrategy;
import com.daemia.alcoholic.entities.BeerStrategy.RegularBeerMovingStrategy;
import com.daemia.alcoholic.entities.BeerStrategy.SmallBeerScoringStrategy;
import com.daemia.alcoholic.entities.BeerStrategy.SmallBeerSizingStrategy;
import com.daemia.alcoholic.entities.PillStrategy.Pill;
import com.daemia.alcoholic.entities.PillStrategy.RegularPillMovingStrategy;
import com.daemia.alcoholic.entities.PillStrategy.RegularPillScoringStrategy;
import com.daemia.alcoholic.entities.PillStrategy.RegularPillSizingStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.BigWhiskeyScoringStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.BigWhiskeySizingStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.MediumWhiskeyScoringStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.MediumWhiskeySizingStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.RegularWhiskeyMovingStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.SmallWhiskeyScoringStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.SmallWhiskeySizingStrategy;
import com.daemia.alcoholic.entities.WhiskeyStrategy.Whiskey;

public class ItemFactory {
	
	private final double SMALL_BEER_STARTING_SPEED = 2.5D;
	private final double BIG_BEER_STARTING_SPEED = 2.0D;
	private final double SMALL_WHISKEY_STARTING_SPEED = 4.0D;
	private final double MEDIUM_WHISKEY_STARTING_SPEED = 3.5D;
	private final double BIG_WHISKEY_STARTING_SPEED = 3.0D;
	private final double PILL_STARTING_SPEED = 1.8D;
	
	private final double PLAYER_STARTING_SPEED = 3.5D;
	
	/**
	 * The method creates a random beer, whiskey or pill item
	 * @param posX the x position of the created item on the screen
	 * @param posY the y position of the created item on the screen
	 * @param fallingItems the random enumeration, what tells which item should be created
	 * @return the created item, based on the enumeration parameter. Default it returns a null.
	 */
	public Entity getItems(double posX, double posY, FallingItems fallingItems) {
		
		switch(fallingItems) {
		case SMALLBEER:
			return new Beer(posX, posY, SMALL_BEER_STARTING_SPEED, new RegularBeerMovingStrategy(), 
					new SmallBeerScoringStrategy(), new SmallBeerSizingStrategy());
		
		case BIGBEER:
			return new Beer(posX, posY, BIG_BEER_STARTING_SPEED, new RegularBeerMovingStrategy(), 
					new BigBeerScoringStrategy(), new BigBeerSizingStrategy());
			
		case SMALLWHISKEY:
			return new Whiskey(posX, posY, SMALL_WHISKEY_STARTING_SPEED, new RegularWhiskeyMovingStrategy(),
					new SmallWhiskeyScoringStrategy(), new SmallWhiskeySizingStrategy());
			
		case MEDIUMWHISKEY:
			return new Whiskey(posX, posY, MEDIUM_WHISKEY_STARTING_SPEED, new RegularWhiskeyMovingStrategy(),
					new MediumWhiskeyScoringStrategy(), new MediumWhiskeySizingStrategy());
			
		case BIGWHISKEY:
			return new Whiskey(posX, posY, BIG_WHISKEY_STARTING_SPEED, new RegularWhiskeyMovingStrategy(),
					new BigWhiskeyScoringStrategy(), new BigWhiskeySizingStrategy());
			
		case PILL:
			return new Pill(posX, posY, PILL_STARTING_SPEED, new RegularPillMovingStrategy(), 
					new RegularPillScoringStrategy(), new RegularPillSizingStrategy());
			
			default: return null;
		}
	}
	
	/**
	 * The method creates a new Player
	 * @param posX the x position of the player
	 * @return a new Player instance
	 */
	public Entity getPlayer(double posX) {
		return new Player(posX, PLAYER_STARTING_SPEED);
	}
}
