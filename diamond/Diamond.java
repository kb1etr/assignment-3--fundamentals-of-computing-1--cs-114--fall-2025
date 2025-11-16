import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in); 

   // Variable declarations
    int inNumber = 0; 
    int ast;
    int row;
    int spacelength;
     
    try { 
      System.out.print("Enter a number: "); 
      inNumber = keyInput.nextInt(); 
      row = inNumber;

      if (inNumber % 2 == 0) {  // Check if input is odd or even 

        for (row = 0; row <= inNumber/2; row++){ //for first half of matrix
          if (row == 0) spacelength = inNumber-1;
          else spacelength = (inNumber/2 - row)*2; 
          for (int space = 1; space <= spacelength; space++){
          System.out.print(" ");
          }
          
          if (row == 0  || row == inNumber) {  // Special case: prints a single asterisk on the first and last row
            System.out.print("* ");
          } 
          else if (row <= inNumber/2){
            for (ast = 1; ast <= row*2; ast++ ){
            
              System.out.print("* ");
              
            }
          }
          System.out.println();
        }

        for (row = inNumber/2 -1; row >= 0; row--){ //for bottom half of the diamond
          if (row == 0) spacelength = inNumber-1;
          else spacelength = (inNumber/2 - row)*2; 
          for (int space = 1; space <= spacelength; space++){
          System.out.print(" ");
          }
          
          if (row == 0  || row == inNumber) {  // Special case: prints a single asterisk on the first and last row
            System.out.print("* ");
          } 
          else if (row <= inNumber/2){
            for (ast = 1; ast <= row*2; ast++ ){
            
              System.out.print("* ");
            }
          }
          System.out.println(); 
        }
      } 
    else {  //for an odd number input
      for (row = 0; row <= (inNumber-1)/2; row++){ //for first half of matrix
          if (row == 0) spacelength = (inNumber-1)/2;
          else spacelength = ((inNumber-1)/2 - row); 
          for (int space = 1; space <= spacelength; space++){ // Print number of leading spaces
          System.out.print(" ");
          }

          if (row == 0  || row == inNumber) {  // prints a single asterisk on the first and last row
           System.out.print("*");
          }
          else if (row <= inNumber/2){
           for (ast = 1; ast <= row*2+1; ast++ ){

            System.out.print("*");
            }
          }
          System.out.println();
        }

      for (row = ((inNumber-1)/2) -1; row >= 0; row--){ //for first half of matrix
          if (row == 0) spacelength = (inNumber-1)/2;
          else spacelength = ((inNumber-1)/2 - row); 
          for (int space = 1; space <= spacelength; space++){ // Print number of leading spaces
          System.out.print(" ");
          }               
          
          if (row == 0  || row == inNumber) {  // special case: prints a single asterisk on the first and last row
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
    return;
  }
    keyInput.close();
  }
}
