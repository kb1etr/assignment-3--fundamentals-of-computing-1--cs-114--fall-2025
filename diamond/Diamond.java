import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in); 

    int inNumber = 0;

    int ast;

    int i=0;

    int row;

    int spacelength;

    try { 

      System.out.print("Enter a number: "); 

      inNumber = keyInput.nextInt(); 

      row = inNumber;

      if (inNumber % 2 == 0) {  // Check if input is odd or even

        System.out.println("even"); 

        for (row = 0; row <= inNumber/2; row++){ //for first half of matrix

          if (row == 0) spacelength = inNumber-1;

          else spacelength = (inNumber/2 - row)*2; 

          for (int space = 1; space <= spacelength; space++){

            System.out.print(" ");
          } 
          //for (int space = 1; space <=inNumber/2; space++)     

          if (row == 0  || row == inNumber) {  // prints a single asterisk on the first and last row
            System.out.print("* ");
          } 
          else if (row <= inNumber/2){                                                                                                   
            for (ast = 1; ast <= row*2; ast++ ){

              System.out.print("* ");

            }
          }
          System.out.println();
        }

        for (row = inNumber/2 -1; row >= 0; row--){ //for second half of matrix

          if (row == 0) spacelength = inNumber-1;

          else spacelength = (inNumber/2 - row)*2; 

           for (int space = 1; space <= spacelength; space++){
           System.out.print(" ");
           } 
          //for (int space = 1; space <=inNumber/2; space++)     

          if (row == 0  || row == inNumber) {  // prints a single asterisk on the first and last row
            System.out.print("* ");
          } 
          else if (row <= inNumber/2){  

           for (ast = 1; ast <= row*2; ast++ ){

            System.out.print("* ");

            }
          }
          System.out.println();       
        }



        /*

        for (i=0; i<row; i++){
          for(j=0; j<row-i-1; j++){
            System.out.print(" ");
          }
          for (j=0; j<=i; j++){
           System.out.print("* "); 
          }
          System.out.println();
        }*/


      } 
      else {  //odd
    // Update variables for spaces and asterisks
      System.out.println("odd"); 

    for (row = 1; row <= inNumber; row++) {
        for (int space = (inNumber / row); space > 1; space--) {
          System.out.print(" ");
        }
        for (ast = 1; ast <= row; ast++) {
          System.out.print("*"); 
        }
        System.out.println();
      }

      /*for (int row = 1; row <= inNumber; row++){
        if (row == 1 || row == inNumber){
          System.out.print(" ");
        }
        
        for (ast = 1; ast <= inNumber-row; ast++)
        System.out.print("*");
        
        System.out.println();
      }*/

    }
    
  } catch (Exception e) {
     
    System.out.println("Invalid input. Please enter an integer.");
    return;
  }
    keyInput.close();
  }
}
