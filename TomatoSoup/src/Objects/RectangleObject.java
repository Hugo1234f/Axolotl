package Objects;

import java.awt.Color;
import java.awt.Graphics2D;

import App.Sprite;
import engine.KeyManager;

public class RectangleObject extends Sprite {
	
	private double mass;
	protected Collider collider;

	public RectangleObject(int x, int y, int width, int height, Color baseColor) {
		super(x,y,width,height,baseColor);
		mass = width * height;
		collider = new Collider(this);
	}
	
	@Override
	public void update(KeyManager keyManager) {
		collider.update(this);
	}
	
	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(baseColor);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}
