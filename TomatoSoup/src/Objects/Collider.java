package Objects;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Collider {

	private Rectangle rectangle;
	private boolean movable;
	private static ArrayList<Collider> colliders;
	public int id;
	
	public Collider(RectangleObject object) {
		if(colliders == null) 
			colliders = new ArrayList<Collider>();
		colliders.add(this);
		
		rectangle = new Rectangle(object.getX(), object.getY(), object.getWidth(), object.getHeight());
	}
	
	public boolean isMovable() {
		return movable;
	}
	
	public Rectangle getRect() {
		return rectangle;
	}
	
	public void setRectangle(Rectangle rect) {
		rectangle = rect;
	}
	
	public boolean isColliding(Rectangle rect) {
		int collisions = 0;
		for(int i = 0; i < colliders.size(); i++) {
			if(colliders.get(i).getRect().intersects(rect)) {
				collisions++;
			}
		}

		if(collisions > 1) {
			return true;
		}
		return false;
	}
	
	public void update(RectangleObject object) {
		rectangle.x = object.getX();
		rectangle.y = object.getY();
		
	}
	
	
	
}
