package App;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import engine.KeyManager;

public abstract class Sprite {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Color baseColor;
	protected Point2D.Double center;
	
	public Sprite(int x, int y, int width, int height, Color baseColor) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.baseColor = baseColor;
		
		center = new Point2D.Double((x+width)/2, (y+height)/2);
	}
	
	public void setX(int x) {this.x = x;}
	public void moveX(int x) {this.x += x;}
	public void setY(int y) {this.y = y;}
	public void moveY(int y) {this.y += y;}
	public void setBaseColor(Color c) {baseColor = c;}
	public void setCenter(Point2D.Double center) {this.center = center;}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public Color getBaseColor() {return baseColor;}
	public Point2D.Double getCenter() {return center;}
	
	public abstract void update(KeyManager keyManager);
	public abstract void draw(Graphics2D graphics);
	
}
