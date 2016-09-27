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
public class MathSoftware {
    
    public MathSoftware(){
        Sorter sortingType;
    }
    
    public Sorter sortingType;
    
    public void setSortStrategy(Sorter newSortType){
        sortingType = newSortType;
    }
    
    public void printArray(int[] arr){
        
        System.out.println("The contents of the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        
    }  // end printArray()
    
}
