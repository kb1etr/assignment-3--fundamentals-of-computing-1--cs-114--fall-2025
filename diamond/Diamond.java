import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    int inNumber = 0;

    boolean workingOnTopHalf = true;

    try {
      System.out.print("Enter a number: ");
      inNumber = keyInput.nextInt();

      if (inNumber % 2 == 0) {  // Check if input is odd or even
        System.out.print("even");
      } else {

      // Update variables for spaces and asterisks
      for (int row = 1; row <= inNumber; row++) {
        for (int space = (inNumber / row); space > 1; space--) {
          System.out.print(" ");
        
        }

        for (int ast = 1; ast <= row; ast++) {
          System.out.print("*");
        }

        System.out.println();

      }
    }

    } catch (Exception e) {
        System.out.println("Invalid input. Please enter an integer.");

        return;
    }
    
    keyInput.close();
  }
}
