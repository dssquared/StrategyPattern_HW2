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
    
    public Sorter sortingType;
    
    public void setSortStrategy(Sorter newSortType){
        sortingType = newSortType;
    }
    public int[] mathSort(int[] array){
        return sortingType.mathSort(array);
    }
    
}
