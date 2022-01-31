package App;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import Objects.BackgroundBox;
import engine.KeyManager;

public class Background {

	String layout;
	BackgroundBox[][] background;
	String backgroundPath;
	Scanner sc;
	
	HashMap<Character, BackgroundBox> knownBoxes;
	
	private static final int width = 32;
	private static final int height = 18;

	public Background() {
		background = new BackgroundBox[32][18];
		backgroundPath = "src/backgrounds/bg.txt";

		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 18; j++) {
				if (j % 2 == 0) {
					background[i][j] = new BackgroundBox(Color.green);
				} else {
					background[i][j] = new BackgroundBox(Color.blue);
				}
			}
		}
		
		setBackground(backgroundPath);
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
	
	private void setBackground(String path) {
		File file = new File(path);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File at " + path + " not found");
		}
		
		String currentLine;
		
		for(int j = 0; j < height; j++) {
			currentLine = sc.nextLine();
			
			for(int i = 0; i < width; i++) {
				switch(currentLine.charAt(i)) {
					case '0':
						background[i][j] = new BackgroundBox(Color.DARK_GRAY);
						break;
					case '1':
						background[i][j] = new BackgroundBox(Color.black);
						break;
				}
					
				
				
			}
		}
	}

}
