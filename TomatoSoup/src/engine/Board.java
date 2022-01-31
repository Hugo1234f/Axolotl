package engine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JComponent;

import App.Background;
import App.Game;

public class Board extends JComponent {

	private final int FPS = 60;
	private Game game;
	private Background background;
	private KeyManager keyManager;
	


	public Board() {
		keyManager = new KeyManager();
		game = new Game();
		background = new Background();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(WIDTH, HEIGHT);
	}

	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D graphics = (Graphics2D) arg0;
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, getWidth(), getHeight());

		background.draw(graphics);
		game.draw(graphics);
	}

	@Override
	protected void processKeyEvent(KeyEvent e) {
		super.processKeyEvent(e);
		if (e.getID() == KeyEvent.KEY_PRESSED)
			keyManager.processKeyEvent(e.getKeyCode(), true);
		else if (e.getID() == KeyEvent.KEY_RELEASED)
			keyManager.processKeyEvent(e.getKeyCode(), false);
	}

	public void Start() {
		while (true) {
			game.update(keyManager);
			try {
				Thread.sleep(1000 / FPS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.repaint();
		}
	}
	

}
