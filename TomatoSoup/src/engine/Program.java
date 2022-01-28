package engine;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Program extends JFrame {

	Board board;

	protected static int WIDTH = 800;
	protected static int HEIGHT = WIDTH * 9/16;

	public Program() {
		board = new Board();

		add(board);
		pack();
		setResizable(false);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

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
