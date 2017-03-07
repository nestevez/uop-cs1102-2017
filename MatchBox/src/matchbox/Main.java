/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchbox;
import java.util.Scanner;
/**
 * This program collects matchbox dimensions from the user and calculates the width 
 * and volume of the matchbox.
 * @author Natalia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing necessary variables
        double width; //matchbox width
        double height; //matchbox height
        double depth; //matchbox depth
        MatchBox mb1 = new MatchBox(); //matchbox
        
        //Getting width, height, and depth from user
        System.out.println("Please enter the values as prompted:");
        System.out.print("width of MatchBox is ");
        Scanner sc = new Scanner (System.in);
        width = sc.nextDouble();
        mb1.width = width;
        System.out.print("height of MatchBox is ");
        height = sc.nextDouble();
        mb1.height = height;
        System.out.print("depth of MatchBox is ");
        depth = sc.nextDouble();        
        mb1.depth = depth;
        
        //Calculating and outputting weight and volume
        mb1.calculateWeight(width, height, depth);
        mb1.getVolume();
        
    }
    
}
