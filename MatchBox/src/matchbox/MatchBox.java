/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchbox;

/**
 *
 * @author Natalia
 */
public class MatchBox extends Box {
    //initializing weight variable
    double weight;
    
    //Empty constructor method
    MatchBox(){
        ;
    }
    
    //Method calculates and outputs the matchbox weight
    void calculateWeight(double w, double h, double d){
        weight = w*h*d*0.03611;
        System.out.println("weight of Matchbox is "+weight);
    }
}
