package engine;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Program extends JFrame {

	private Board board;

	public static int WIDTH = 1280;
	public static int HEIGHT = 720;

	public Program() {
		board = new Board();

		add(board);
		pack();
		setResizable(false);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Tomato Soup");

		board.Start();

	}

	public static void main(String[] args) {
		Program program = new Program();
	}

	@Override
	protected void processKeyEvent(KeyEvent e) {
		super.processKeyEvent(e);
		board.processKeyEvent(e);
	}

}
