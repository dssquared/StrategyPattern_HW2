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
public class MyMath implements Sorter{
	public int[] mathSort(int[] array){
		for(i = 0; i < array.length; i++){
			for(j = 1; j < array.length - i; j++){
				if(array[j-1] > array[j]){
					int numJ = array[j];
					array[j] = array[j+1];
					array[j+1] = numJ;
				}
			}
		}
		return array;
	}
}
