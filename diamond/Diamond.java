import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in); 

    int inNumber; int ast; int row; int spaceLength;

    try { 
      System.out.print("Enter a number: "); 
      inNumber = keyInput.nextInt(); 

      row = inNumber;

      if (inNumber % 2 == 0) {  // Check if input is odd or even - EVEN CASE

        for (row = 0; row <= inNumber/2; row++){ //for first half the diamond
          if (row == 0) spaceLength = inNumber-1;
          else spaceLength = (inNumber/2 - row)*2; 
          for (int space = 1; space <= spaceLength; space++){
          System.out.print(" ");
          }

          if (row == 0) {  // Special case: prints a single asterisk on the first row
            System.out.print("*");
          } 
          else if (row <= inNumber/2){
            for (ast = 1; ast <= row*2; ast++ ){
              System.out.print("* ");

            }
          }
          System.out.println();
        }

        for (row = inNumber/2 -1; row >= 0; row--){ //for bottom half of the diamond
          if (row == 0) spaceLength = inNumber-1;
          else spaceLength = (inNumber/2 - row)*2; 
          for (int space = 1; space <= spaceLength; space++){
          System.out.print(" ");
          }

          if (row == 0) {  // Special case: prints a single asterisk last row
            System.out.print("*");
          } 
          else if (row <= inNumber/2){
            for (ast = 1; ast <= row*2; ast++ ){
              System.out.print("* ");
            }
          }
          System.out.println(); 
        }
      }

    else {  //for an odd number input - ODD CASE
      for (row = 0; row <= (inNumber-1)/2; row++){ //for first half of the diamond
          if (row == 0) spaceLength = (inNumber-1)/2;
          else spaceLength = ((inNumber-1)/2 - row); 
          for (int space = 1; space <= spaceLength; space++){ // Print number of leading spaces
          System.out.print(" ");
          }

          if (row == 0) {  // prints a single asterisk on the first row
           System.out.print("*");
          }
          else if (row <= inNumber/2){
           for (ast = 1; ast <= row*2+1; ast++ ){
            System.out.print("*");
            }
          }
          System.out.println();
        }

      for (row = ((inNumber-1)/2) -1; row >= 0; row--){ //for bottom half of the diamond
          if (row == 0) spaceLength = (inNumber-1)/2;
          else spaceLength = ((inNumber-1)/2 - row); 
          for (int space = 1; space <= spaceLength; space++){ // Print number of leading spaces
          System.out.print(" ");
          }

          if (row == 0) {  // special case: prints a single asterisk on the last row
            System.out.print("*");
          } 
          else if (row <= inNumber){
            for (ast = 1; ast <= row*2+1; ast++ ){
             System.out.print("*");
            }
          }
          System.out.println();
        }
    }

  } catch (Exception e) {

    System.out.println("Invalid input. Please enter an integer.");
    keyInput.close();
    return;
  }
    keyInput.close();
  }
}
