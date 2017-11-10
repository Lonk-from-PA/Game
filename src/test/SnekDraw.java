package test;

import java.awt.Graphics;

import attributes.Sprite;

public class SnekDraw {
	
	Sprite snekS;
	Graphics g;
	
	public SnekDraw(Graphics grap) {
		g = grap;
		snekS = new Sprite("snek.png", grap);
	}
	
	public void draw() {
		snekS.drawSprite();
	}

}
