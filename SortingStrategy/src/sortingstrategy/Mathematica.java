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
public class Mathematica implements Sorter{
	public int[] mathSort(int[] array){
		for(i = 0; i < array.length; i++){
			int smallestIndex = i;
			for(j = 0; j < array.length; j++){
				if(array[j] < array[smallestIndex]){
					smallestIndex = j;
				}
			}
			int smallestNum = array[smallestIndex];
			array[smallestIndex] = array[i];
			array[i] = smallestNum;
		}
		return array;
	}
}
