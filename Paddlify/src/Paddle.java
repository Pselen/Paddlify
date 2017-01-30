/*Class for paddle and its movements.*/
public class Paddle {
	// Set paddle's default location.
	static int paddle[][] = { { 19, 16 }, { 19, 17 }, { 19, 18 }, { 1, 0 } };

	public Paddle() {
	}

	public int[][] getPaddle() {
		return paddle;
	}

	// Move paddle left by decreasing the paddle's column number.
	public int[][] paddleLeft(int[][] p) {
		if (getMinCol(p) < 2)
			return p;
		for (int i = 0; i < p.length - 1; i++) {
			p[i][1]--;
		}
		return p;
	}

	// Move paddle right by increasing the paddle's column number.
	public int[][] paddleRight(int[][] p) {
		if (getMaxCol(p) > 32)
			return p;
		for (int i = 0; i < p.length - 1; i++) {
			p[i][1]++;
		}
		return p;
	}

	public int[][] paddleWait(int[][] p) {
		return p;
	}

	// This method returns an integer value which is the minimum column value
	// for
	// paddle.
	public int getMinCol(int[][] p) {
		int min = 3;
		for (int i = 0; i < p.length - 1; i++) {
			if (p[i][1] < min)
				min = p[i][1];
		}
		return min;
	}

	// This method returns an integer value which is the maximum column value
	// for
	// paddle.
	public int getMaxCol(int[][] p) {
		int max = -3;
		for (int i = 0; i < p.length - 1; i++) {
			if (p[i][1] > max)
				max = p[i][1];
		}
		return max;
	}
}
// End of Paddle Class.