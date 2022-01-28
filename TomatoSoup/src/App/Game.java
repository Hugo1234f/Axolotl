package App;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import Objects.PlayerObject;
import Objects.RectangleObject;
import engine.KeyManager;

public class Game {
	
	private PlayerObject player;
	private RectangleObject box;
	
	public Game() {
		player = new PlayerObject(100,100,25,25, Color.red);
		player.setPath("src/images/test.png");
		box = new RectangleObject(200, 200, 50, 50, Color.red);

	}

	public void update(KeyManager keyManager) {
		player.update(keyManager);
		box.update(keyManager);
	}

	public void draw(Graphics2D g) {
		player.draw(g);
		box.draw(g);
	}

}
