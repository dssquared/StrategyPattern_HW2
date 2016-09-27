/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingstrategy;

/**
 *
 * @author David Schwehr <dpschwehr[AT]gmail[dotCOM]> github: dssquared
 */

// MathProgram will be an instancce of MathSoftware, MathSoftware will have a 
// Sorter type that can be changed in order to change the sorting strategy
public class MathProgram extends MathSoftware{
    
    public MathProgram(){
        sortingType = new Mathematica();
    }
    
    
    public void printArray(int[] arr){
        
        System.out.println("The contents of the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        
    }  // end printArray()
    
}  // end class
