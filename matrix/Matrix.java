
public class Matrix {
    private int[][] data; // The 2D array to store matrix elements
    private int[][] data1; // The 2D array to store backup matrix elements
    private int rows;
    private int cols;
    public static int size;

    // Constructor to initialize the matrix with given dim
    public Matrix(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive.");
        }
        this.rows = size;
        this.cols = size;
        this.data = new int[rows][cols]; // Initialize the 2D array
        this.data1 = new int[rows][cols];
        System.out.print("\n\nDimension of the matrix is: ");
        System.out.print(size);
        System.out.print(" x ");
        System.out.println(size);
    }

    // Method to get a specific element from the matrix
    public int getElement(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid matrix coordinates.");
        }
        return data[row][col];
    }

    // Method to set a specific element in the matrix
    public void setElement(int row, int col, int value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid matrix coordinates.");
        }
        data[row][col] = value;
    }

    // Method to print the matrix
    public void printMatrix() {
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i+j == size-1){
                  System.out.print("\t"+(char)27 + "[33m"); // Set color to yellow for diagonals
                }
                else {
                  System.out.print("\t"+(char)27 + "[0m");    // reset color to default
                }
                System.out.print(data[i][j]); // Print element 
            }
            System.out.println(); // New line after each row
        }
    }

    public static void swap(int[][] matrix, int x1, int x2, int y1, int y2) {
    // Check for valid row indices
        if (x1 < 0 || x1 >= matrix.length || x2 < 0 || x2 >= matrix.length) {
        System.out.println("Invalid row indices.");
        return;
        }
        for (int j = 0; j < matrix[0].length; j++) { // Iterate through columns
        int temp = matrix[x1][j];
        matrix[x1][j] = matrix[x2][j];
        matrix[x2][j] = temp;
        }   
    // Check for valid column indices
        if (y1 < 0 || y1 >= matrix[0].length || y2 < 0 || y2 >= matrix[0].length) {
        System.out.println("Invalid column indices.");
        return;
        }

        for (int i = 0; i < matrix.length; i++) { // Iterate through rows
            int temp = matrix[i][y1];
            matrix[i][y1] = matrix[i][y2];
            matrix[i][y2] = temp;
        }
    }

    public void flipMatrix(){  	// Flips matrix, keeps diagnals untouched

        System.out.print("\nFlipping matrix...");

    	// Save data in another matrix to prevent overwriting data of same matrix
    	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {  // copy matrix to new array
            	data1[i][j] = data[i][j];             	
            }
    	}
    	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { //flip triangles and copy back to original array
            	if (i+j != size-1){          // diagnols are untouched
            		int temp = data1[i][j];
            		data[size-1-i][size-1-j] = temp;            		
            	}
            }
        }
        System.out.println("matrix flipped");
    }

    public void populateMatrix(){
    	// Fill and print with incrementing pattern starting with a '1'

		int k = 1;

		System.out.print("\nPopulating matrix...");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {               
                setElement(i, j, k);
                k++;
            }
        }
        System.out.println("matrix populated");
    }
}
