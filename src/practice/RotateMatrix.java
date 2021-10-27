package practice;

public class RotateMatrix {
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				
				System.out.print(" " + matrix[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length; 
        
        if (rows < 2 && cols < 2) {
            return;
        }
        
        transpose(matrix, rows, cols);
        reflect(matrix, rows, cols);
    }
    
    private static void transpose(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; ++i) {
            for (int j = i; j < cols; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    private static void reflect(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - 1 - j];
                matrix[i][cols - 1 - j] = temp;
            }
        }
    }
    
    private static void flipDiagonally(int[][] matrix) {
    	int rows = matrix.length, cols = matrix[0].length;
    	
    	for (int row = 0; row < (rows - 1); ++row) {  
    		for (int col = 0; col < (cols - 1 - row); ++col) {
    			int r = (rows - 1) - col;
    			int c = (cols - 1) - row;
    			
    			int temp = matrix[row][col];
    			matrix[row][col] = matrix[r][c];
    			matrix[(rows - 1) - col][(cols - 1) - row] = temp;
    		}
    	}
    }
	
	public static void main(String[] args) {
		int[][] matrix = randomMatrix(3, 3, 0, 9);
		printMatrix(matrix);
		
		flipDiagonally(matrix);
		//rotate(matrix);
		
		printMatrix(matrix);
	}
}
