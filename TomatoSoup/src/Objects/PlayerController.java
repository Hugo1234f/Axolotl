package Objects;

import engine.KeyManager;
import engine.Program;

import java.awt.Rectangle;

import engine.Key;

public class PlayerController {

	private PlayerObject player;
	private boolean useSynchronizedSpeed = false;
	private int xSpeed = 2;
	private int ySpeed = 2;
	
	public PlayerController(PlayerObject player) {
		this.player = player;
	}
	
	public void Update(KeyManager keyManager) {
		if(keyManager.isKeyDown(Key.Right) && player.getX() + player.getWidth() + 18 < Program.WIDTH) {
			Rectangle moveRect = new Rectangle(player.getX() + xSpeed, player.getY(), player.getWidth(), player.getHeight());
			if(!player.collider.isColliding(moveRect))
				player.moveX(xSpeed);
		}
		if(keyManager.isKeyDown(Key.Left) && player.getX() > 0) {
			Rectangle moveRect = new Rectangle(player.getX() - xSpeed, player.getY(), player.getWidth(), player.getHeight());
			if(!player.collider.isColliding(moveRect))
				player.moveX(-xSpeed);
		}
		if(keyManager.isKeyDown(Key.Up) && player.getY() > 0) {
			Rectangle moveRect = new Rectangle(player.getX(), player.getY() - ySpeed, player.getWidth(), player.getHeight());
			if(!player.collider.isColliding(moveRect))
				player.moveY(-ySpeed);
		}
		if(keyManager.isKeyDown(Key.Down) && player.getY() + player.getWidth() + 39 < Program.HEIGHT) {
			Rectangle moveRect = new Rectangle(player.getX(), player.getY() + ySpeed, player.getWidth(), player.getHeight());
			if(!player.collider.isColliding(moveRect))
				player.moveY(ySpeed);
		}
		
		System.out.println(player.getX() + " " + (player.getX() + player.getWidth()));
	}
	
	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(int speed) {
		if(useSynchronizedSpeed) {
			this.xSpeed = this.ySpeed = speed;
		}
	}
	
}
