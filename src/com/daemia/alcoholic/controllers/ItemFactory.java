package com.daemia.alcoholic.controllers;

import com.daemia.alcoholic.entities.Beer;
import com.daemia.alcoholic.entities.Entity;
import com.daemia.alcoholic.entities.Items;
import com.daemia.alcoholic.entities.Pill;
import com.daemia.alcoholic.entities.Whiskey;

public class ItemFactory {
	
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
