public class MatrixNeighbors {

	// In a matrix, nice way to iterate through an index's neighbors (vert, horiz, diagonal). 
	// this example is done in order to solve the game of life problem on leetcode 
	public static void neighbors(int[][] board, int a, int b) {
		int count = 0; 

		for (int i = Math.max(0, a - 1); i <= Math.min(board.length - 1, a + 1); i++) {
			for (int j = Math.max(0, b - 1), j <= Math.min(board[0].length - 1, b + 1); j++) {
				if (i != a && b != j && board[i][j] == 1) {
					count++; 
				}
			}
		}
	}
}