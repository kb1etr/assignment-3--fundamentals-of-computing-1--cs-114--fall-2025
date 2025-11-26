// import MatrixPackage.Matrix;
import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nPlease enter the size of your matrix: ");
        size = scanner.nextInt();

        // Create a Matrix object (instantiation) with user-defined dimensions
        Matrix myMatrix = new Matrix(size);

        myMatrix.size = size;  //sets class static variable to the local variable
                               // This is needed for the class static variable to be used throughout

        int numRows = myMatrix.size;  // set rows and columns == size for a square matrix
        int numCols = myMatrix.size;

        System.out.println("\nPrinting matrix with default values:");// Print out the '0' filled matrix
        myMatrix.printMatrix();
        System.out.println();
  
        myMatrix.populateMatrix();
    System.out.println("\nPrinting matrix:");
        myMatrix.printMatrix();

     // Swap incrementing pattern leaving the center diagnal unchanged
        myMatrix.flipMatrix();
        myMatrix.printMatrix();
        scanner.close(); // Close the scanner to release resources
    
  }
}
