package Objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import App.Sprite;
import engine.KeyManager;

public class RectangleObject extends Sprite {
	
	private double mass;
	protected Collider collider;
	boolean useSprite;
	BufferedImage img;
	String imagePath;

	public RectangleObject(int x, int y, int width, int height, Color baseColor) {
		super(x,y,width,height,baseColor);
		mass = width * height;
		collider = new Collider(this);
	}
	
	public void setPath(String path) {
		imagePath = path;
		tryLoadFile();
	}
	
	private void tryLoadFile() {
		try {
			img = ImageIO.read(new File(imagePath));
			useSprite = true;
		} catch (IOException e) {
			useSprite = false;
			System.out.println("Failed to load image");
		}
		
	}
	
	@Override
	public void update(KeyManager keyManager) {
		collider.update(this);
	}
	
	@Override
	public void draw(Graphics2D graphics) {
		if(useSprite) {
			graphics.drawImage(img, null, getX(), getY());
		}else {
			graphics.setColor(baseColor);
			graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		}
		
	}
	
}
