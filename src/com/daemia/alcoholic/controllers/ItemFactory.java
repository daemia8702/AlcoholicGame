package com.daemia.alcoholic.controllers;

import com.daemia.alcoholic.entities.Beer;
import com.daemia.alcoholic.entities.Entity;
import com.daemia.alcoholic.entities.Items;
import com.daemia.alcoholic.entities.Pill;
import com.daemia.alcoholic.entities.Whiskey;

public class ItemFactory {
	
	/**
	 * The method creates a random beer, whiskey or pill item
	 * @param posX the x position of the created item on the screen
	 * @param posY the y position of the created item on the screen
	 * @param fallingItems the random enumeration, what tells which item should be created
	 * @return the created item, based on the enumeration parameter. Default it returns a null.
	 */
	public Entity getItems(double posX, double posY, FallingItems fallingItems) {
		
		switch(fallingItems) {
		case BEER:
			return new Beer(posX, posY, Items.WIDTH, Items.HEIGHT);
		case WHISKEY:
			return new Whiskey(posX, posY, Items.WIDTH, Items.HEIGHT);
		case PILL:
			return new Pill(posX, posY, Items.WIDTH, Items.HEIGHT);
			default: return null;
		}
	}
}
