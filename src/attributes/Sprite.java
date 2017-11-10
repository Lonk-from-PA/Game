package attributes;

import java.awt.Graphics;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	
	BufferedImage theSprite;
	Graphics g;
	
	public Sprite(String name, Graphics grap) {
		g = grap;
		try {
			theSprite = ImageIO.read(new File("C:\\Users\\Noah Windflame\\eclipse-workspace\\Game\\sprites\\snek.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void drawSprite() {
		g.drawImage(theSprite, 0, 0, 500, 500, null);
	}
	
}
