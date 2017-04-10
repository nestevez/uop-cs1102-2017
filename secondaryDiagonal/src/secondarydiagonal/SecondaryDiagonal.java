/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondarydiagonal;
import java.util.Scanner;
/**
 *
 * @author Natalia
 */
public class SecondaryDiagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializing variables
        int numberOfRows = 0; //number of rows
        int numberOfColumns = 1; //number of columns
        int[][] m; //matrix created
        Scanner scan = new Scanner(System.in); //creating scanner
        double secDiag; //secondary diagonal
        int row; //row counter number
        int column; //column counter number
        
        //Getting matrix size from user
        while (numberOfRows != numberOfColumns){
            System.out.print("Please enter the number of rows for the matrix: ");
            numberOfRows = scan.nextInt();
            System.out.print("Please enter the number of columns for the matrix: ");
            numberOfColumns = scan.nextInt();
        
            if (numberOfRows != numberOfColumns) {
                System.out.println("This is not a square matrix.");
            }
        }
        //creating the matrix
        m = new int[numberOfRows][numberOfColumns];
        
        for (int i=0; i< numberOfRows; i++){
            row = i+1;
            System.out.println("Please enter the values for row "+row);
            for (int j=0; j<numberOfColumns; j++) {
                System.out.print("# ");
                m[i][j] = scan.nextInt();
            }
        }
        
        secDiag = getSecondaryDiag(m,numberOfRows, numberOfColumns);
        
        //outputting the matrix and the secondary diagonal
        System.out.println("The matrix you entered looks like this: ");
        for (int i=0; i < numberOfRows; i++){
            for (int j=0; j < numberOfColumns; j++) {
                row = i;
                column = j;
                System.out.print(m[row][column]+" ");
            }
            System.out.println("");
        }
        System.out.println("The secondary diagonal for the matrix you entered is "+secDiag);
    }
    
    public static int getSecondaryDiag(int[][] m, int r, int c) {
        int secondaryDiag = 0;
        int i = 0;
        int j = c-1;
                
        while ((j>=0) && (i<r)) {
            secondaryDiag = secondaryDiag + m[i][j];
            i++;
            j--;
        }
        
        return secondaryDiag;
    }
  
}