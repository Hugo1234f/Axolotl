package App;

import java.awt.Color;
import java.awt.Graphics2D;

import Objects.PlayerObject;
import Objects.RectangleObject;
import engine.KeyManager;

public class Game {

	PlayerObject player;
	
	public Game() {
		player = new PlayerObject(100,100,25,25, Color.red);
	}

	public void update(KeyManager keyManager) {
		player.update(keyManager);
	}

	public void draw(Graphics2D g) {
		player.draw(g);
	}

}
