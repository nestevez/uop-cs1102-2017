/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarematrix1;
import java.util.Scanner;
/**
 *
 * @author Natalia
 */
public class SquareMatrix1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number of rows/columns in matrix : ");    //rows and columns in matrix must be same.
           int rows = scanner.nextInt();
           int columns=rows;
           int[][] matrix = new int[rows][rows];
           
           System.out.println("Enter the elements in matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        matrix[i][j] = scanner.nextInt();
                  }
           }
 
           //Logic to calculate sum of diagonal1
           int valueOfDiagonal1=0;
           for (int i = 0, j =0; i< rows && j < columns; i++, j++) {
                  valueOfDiagonal1= valueOfDiagonal1 + matrix[i][j];
                  
           }
           
           //Logic to calculate sum of diagonal2
           int valueOfDiagonal2=0;
           for (int i=0,j=columns-1 ; i<rows && j>=0 ; i++, j--) {
                  valueOfDiagonal2= valueOfDiagonal2 + matrix[i][j];
                  
           }
 
           System.out.println("\nMatrix is : ");
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                        System.out.print(matrix[i][j] + " ");
                  }
                  System.out.println();
           }
 
           System.out.println("value of diagonal1 elements="+valueOfDiagonal1+", value of diagonal2 elements ="+ valueOfDiagonal2 );
           System.out.println("value of diagonal1 and diagonal2 elements is: "+ (valueOfDiagonal1+ valueOfDiagonal2) );
 
        
        
    }
    }
