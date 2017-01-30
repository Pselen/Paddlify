import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameController extends Frame implements KeyListener {
	Label label = new Label("PADDLIFY");
	private static final long serialVersionUID = 1L;
	// We create an object to create grid and put paddle,
	// ball and brick objects on it.
	Grid g = new Grid();
	Paddle pdl = new Paddle();
	Ball bll = new Ball();
	Bricks brc = new Bricks();

	int[][] paddle = pdl.getPaddle();
	int[][] ball = bll.getBall();
	char[][] grid = Grid.getGrid();
	int[][] brick = brc.getDefaultBrick();

	public GameController() {
		// We create a small pane to listen keys and show round.
		setVisible(true);
		setSize(150, 80);
		Panel panel = new Panel();
		add(panel);
		panel.add(label);
		Font f = new Font("Courier", Font.BOLD, 15);
		label.setFont(f);
		label.setPreferredSize(new Dimension(135, 40));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addKeyListener(this);
		// Our game screen, which is named as grid, is a 2D char array, and in
		// order to add game objects to the points that want, we used
		// addSape method.
		g.addShape(grid, ball, 'o');
		g.addShape(grid, paddle, 'x');
		g.addShape(grid, brick, 'W');
		brick = brc.getYellowBrick();
		g.addShape(grid, brick, 'Y');
		brick = brc.getDefaultBrick2();
		g.addShape(grid, brick, 'W');
		brick = brc.getYellowBrick2();
		g.addShape(grid, brick, 'Y');
		brick = brc.getDefaultBrick3();
		g.addShape(grid, brick, 'W');
		brick = brc.getDefaultBrick4();
		g.addShape(grid, brick, 'W');
		brick = brc.getYellowBrick3();
		g.addShape(grid, brick, 'Y');
		brick = brc.getDefaultBrick5();
		g.addShape(grid, brick, 'W');
		brick = brc.getDefaultBrick6();
		g.addShape(grid, brick, 'W');
		g.deleteX(grid, paddle);
		System.out
				.println("\n\n*PRESS SPACE TO START THE GAME: PADDLIFY*\nWhite Bricks: Destroy itself and ball bounces back. \nYellow Bricks: Destroy itself and bricks near it.");
	}

	public void keyPressed(KeyEvent e) {
		// Game will not accept inputs other than left arrow, right arrow and
		// space bar.
		if (e.getKeyCode() == KeyEvent.VK_LEFT
				|| e.getKeyCode() == KeyEvent.VK_RIGHT
				|| e.getKeyCode() == KeyEvent.VK_SPACE) {
			// Operations that will perform each time keys are pressed.
			switch (e.getKeyCode()) {

			case KeyEvent.VK_LEFT:
				pdl.paddleLeft(paddle);
				g.addShape(grid, ball, 'o');
				g.addShape(grid, paddle, 'x');
				g.printGrid(grid);
				g.deleteX(grid, paddle);
				break;

			case KeyEvent.VK_RIGHT:
				pdl.paddleRight(paddle);
				g.addShape(grid, ball, 'o');
				g.addShape(grid, paddle, 'x');
				g.printGrid(grid);
				g.deleteX(grid, paddle);
				break;

			case KeyEvent.VK_SPACE:
				pdl.paddleWait(paddle);
				g.addShape(grid, ball, 'o');
				g.addShape(grid, paddle, 'x');
				g.printGrid(grid);
				g.deleteX(grid, paddle);
				break;
			}
			// For the first move of user.
			bll.move(grid, ball);
			pdl.paddleWait(paddle);
			g.addShape(grid, ball, 'o');
			g.addShape(grid, paddle, 'x');
			g.printGrid(grid);
			g.deleteX(grid, paddle);
			// Second move will be done by the game automatically.
			bll.move(grid, ball);
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
}
// End of GameController Class.