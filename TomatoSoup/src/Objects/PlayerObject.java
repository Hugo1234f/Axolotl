package Objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import engine.KeyManager;

public class PlayerObject extends RectangleObject {

	private PlayerController playerController;
	
	public PlayerObject(int x, int y, int width, int height, Color baseColor) {
		super(x, y, width, height, baseColor);
		playerController = new PlayerController(this);
	}

	@Override
	public void update(KeyManager keyManager) {
		setCenter(new Point2D.Double((getX()+getWidth())/2, (getY() + getHeight()) / 2));
		
		playerController.Update(keyManager);
		collider.update(this);
		
		//System.out.println("X: " + collider.getRect().x + " Y: " + collider.getRect().y);
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(baseColor);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
