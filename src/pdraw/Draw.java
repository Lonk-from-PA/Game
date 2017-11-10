package pdraw;

import javax.swing.JFrame;

import javax.swing.WindowConstants;

import pmain.Constants;


import test.*;

public class Draw {
	
	boolean quit;
	SnekDraw snake;
	
	public Draw() {
		JFrame drawFrame = new JFrame("Bonk");
		quit = false;
		drawFrame.setSize(Constants.width, Constants.height);
		drawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		drawFrame.setVisible(true);
		snake = new SnekDraw(drawFrame.getGraphics());
	}
	
	public void drawFrame() throws InterruptedException {
		while (!quit) {
			snake.draw();
			Thread.sleep((long) (16 + (2.0 / 3.0)));
		}
	}

}
