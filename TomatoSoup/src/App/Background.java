package App;

import java.awt.Color;
import java.awt.Graphics2D;

import Objects.BackgroundBox;
import engine.KeyManager;

public class Background {

	String layout;
	BackgroundBox[][] background;

	public Background() {
		background = new BackgroundBox[32][18];

		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 18; j++) {
				if (j % 2 == 0) {
					background[i][j] = new BackgroundBox(Color.green);
				} else {
					background[i][j] = new BackgroundBox(Color.blue);
				}
			}
		}
	}

	public void update(KeyManager keyManager) {

	}

	public void draw(Graphics2D graphics) {
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 18; j++) {
				graphics.setColor(background[i][j].getBaseColor());
				graphics.fillRect(i * 40, j * 40, 40, 40);
			}
		}
	}

	public void setLayout(String path) {
		this.layout = path;
	}

}
