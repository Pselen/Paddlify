//Class for defining bricks and their locations.
public class Bricks {

	int defaultBrick[][] = { { 3, 8 }, { 3, 9 }, { 3, 10 }, { 4, 8 }, { 4, 9 },
			{ 4, 10 }, { 0, 0 } };
	int yellowBrick[][] = { { 3, 12 }, { 3, 13 }, { 3, 14 }, { 4, 12 },
			{ 4, 13 }, { 4, 14 }, { 0, 0 } };
	int defaultBrick2[][] = { { 3, 16 }, { 3, 17 }, { 3, 18 }, { 4, 16 },
			{ 4, 17 }, { 4, 18 }, { 0, 0 } };
	int yellowBrick2[][] = { { 3, 20 }, { 3, 21 }, { 3, 22 }, { 4, 20 },
			{ 4, 21 }, { 4, 22 }, { 0, 0 } };
	int defaultBrick3[][] = { { 3, 24 }, { 3, 25 }, { 3, 26 }, { 4, 24 },
			{ 4, 25 }, { 4, 26 }, { 0, 0 } };

	int defaultBrick4[][] = { { 6, 10 }, { 6, 11 }, { 6, 12 }, { 7, 10 },
			{ 7, 11 }, { 7, 12 }, { 0, 0 } };
	int yellowBrick3[][] = { { 6, 16 }, { 6, 17 }, { 6, 18 }, { 7, 16 },
			{ 7, 17 }, { 7, 18 }, { 0, 0 } };
	int defaultBrick5[][] = { { 6, 22 }, { 6, 23 }, { 6, 24 }, { 7, 22 },
			{ 7, 23 }, { 7, 24 }, { 0, 0 } };

	int defaultBrick6[][] = { { 9, 16 }, { 9, 17 }, { 9, 18 }, { 10, 16 },
			{ 10, 17 }, { 10, 18 }, { 0, 0 } };

	public Bricks() {
	}

	public int[][] getDefaultBrick() {
		return defaultBrick;
	}

	public int[][] getDefaultBrick2() {
		return defaultBrick2;
	}

	public int[][] getDefaultBrick3() {
		return defaultBrick3;
	}

	public int[][] getDefaultBrick4() {
		return defaultBrick4;
	}

	public int[][] getDefaultBrick5() {
		return defaultBrick5;
	}

	public int[][] getDefaultBrick6() {
		return defaultBrick6;
	}

	public int[][] getYellowBrick() {
		return yellowBrick;
	}

	public int[][] getYellowBrick2() {
		return yellowBrick2;
	}

	public int[][] getYellowBrick3() {
		return yellowBrick3;
	}
}
// End of Bricks Class.