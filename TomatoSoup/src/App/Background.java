package App;

import java.awt.Color;
import java.awt.Graphics2D;

import engine.KeyManager;

public class Background {

	String layout;
	Color[][] background;
	
	public Background() {
		background = new Color[32][18];
		
		for(int i = 0; i < 32; i++) {
			for(int j = 0; j < 18; j++) {
				if(j%2 == 0) {
					background[i][j] = Color.green;
				}else {
					background[i][j] = Color.blue;
				}
			}
		}
	}
	
	public void update(KeyManager keyManager) {
		
	}
	
	public void draw(Graphics2D graphics) {
		for(int i = 0; i < 32; i++) {
			for(int j = 0; j < 18; j++) {
				graphics.setColor(background[i][j]);
				graphics.fillRect(i*40, j*40, 40, 40);
			}
		}
	}
	
	public void setLayout(String path) {
		this.layout = path;
	}
	
}
