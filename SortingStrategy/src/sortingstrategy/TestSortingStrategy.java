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
public class TestSortingStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {11, 4, 7, 9, 2, 1};
        MathSoftware program = new MTool();
        program.mathSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
