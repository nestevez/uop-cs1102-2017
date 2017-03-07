/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystatcalc;
import java.util.Scanner;
/**
 * This program creates a StatCalc and uses it to calculate the count, mean and
 * standard deviation for the data points entered by the user.
 * @author Natalia
 */
public class MyStatCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing variables
        int dataCount; //count of data points
        double dataAvg; //average of numbers in the data set
        double standDev; //standard deviation of data set
        double number; //numbers added by user
        String str; //user's input
        boolean enteringNums = true; //loop condition
        
        //Instantiation of myStatCalc
        StatCalc myStatCalc;
        myStatCalc = new StatCalc();        
        
        //Getting data points from user
        System.out.println("Please enter a number to be added to the data set. "
                + "When done, enter 'done':");
        while (enteringNums == true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("# ");
            str = sc.next();
            if (str.equals("done")){
                enteringNums = false;    
            }
            else {
                try { 
                    number = Double.parseDouble(str);
                    myStatCalc.enter(number);
                }
                catch (NumberFormatException e) {
                    System.out.println("Not a valid number. Try again.");
                }
            };
        };        
        
        //Using StatCalc methods for finding statistics
        dataCount = myStatCalc.getCount();
        dataAvg = myStatCalc.getMean();
        standDev = myStatCalc.getStandardDeviation();
        
        //Outputing the count, mean, and standard deviation
        System.out.println("There are "+dataCount+" numbers in the data set.");
        System.out.println("The average of the numbers in the data set is "+dataAvg);
        System.out.println("The standard deviation of the data set is "+standDev);

    }
    
}
