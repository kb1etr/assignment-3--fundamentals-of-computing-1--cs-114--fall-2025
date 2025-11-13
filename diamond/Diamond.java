import java.util.Scanner;

public class Diamond {
public static void main(String[] args) {

  Scanner keyInput = new Scanner(System.in);

 int number = 0;

 boolean workingOnTopHalf = true;

 System.out.print("Enter a number: ");
 number = keyInput.nextInt();

    for (int row = 1; row <= number; row++) {
      for (int space = number - row; space >= 1; space--) {
        System.out.print(" |");
      }
      for (int ast = 1; ast <= row; ast++) {
        System.out.print("*");
      }

      System.out.println();


    
    }

  }
}
