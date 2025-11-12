 import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
  
  Scanner keyInput = new Scanner(System.in);

  int number;

  System.out.print("Enter a number: ");
  number = keyInput.nextInt();

  int [][] table = new int[number][number];
  
  for (int row = 0; row < table.length; row 223++) {
    for (int col = 0; col < (table[row].length - 1); col++) {
      System.out.print((row) + ", " + (col) +" : ");
      } 
    
      System.out.println();
    
  
    }

  
  }
}
