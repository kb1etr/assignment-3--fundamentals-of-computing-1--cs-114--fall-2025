import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
  
  Scanner keyInput = new Scanner(System.in);

  int number = 0;

  System.out.print("Enter a number: ");
  number = keyInput.nextInt();

  int [][] table = new int[number][number];
  
table [0][1] =1 ;table [1][0] = 1; table [1][1] = 1; table [1][2] = 1; table  [2][1] =1;




  for (int row = 0; row < table.length; row++) {
    for (int col = 0; col < (table[row].length); col++) {
      // System.out.print((table[row][col])+" : ");
      if ((table[row][col])== 1) {
        System.out.print("*");

      }
      else {
        System.out.print(" ");
      
      }

      } 
    
      System.out.println();
    
    }

  }
}
