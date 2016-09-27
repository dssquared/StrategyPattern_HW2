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
public interface Sorter {
    
    public int[] mathSort(int[] arr);
}
class Insertion implements Sorter{
	public int[] mathSort(int[] array){
		for(int i = 0; i < array.length; i++){
			int smallestIndex = i;
			for(int j = i; j < array.length; j++){
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
class Merge implements Sorter{
	public int[] mathSort(int[] array){
		if(array.length <= 1){
			return array;
		}
		int[] front = new int[array.length/2];
		int[] back = new int[array.length-front.length];
		for(int i = 0; i < array.length; i++){
			if(i < front.length){
				front[i] = array[i];
			}
			else{
				back[i-front.length] = array[i];
			}
		}
		mathSort(front);
		mathSort(back);

		for(int i = 0; i < array.length; i+=0){
			for(int j = 0; j < front.length; j+=0){
				for(int k = 0; k < back.length; k+=0){
					if(front[j]<back[k]){
						array[i] = front[j];
						i++;
						if(j+1 < front.length){
                                                    j++;
						}
                                                else{
                                                    while(k < back.length && i < array.length){
                                                        array[i]=back[k];
                                                        i++;
                                                        k++;
                                                    }
                                                    j = front.length;
                                                }
					}
					else{
						array[i] = back[k];
						i++;
						if(k+1 < back.length && i < array.length){
							k++;
						}
                                                else{
                                                    while(j < front.length){
                                                        array[i]=front[j];
                                                        i++;
                                                        j++;
                                                    }
                                                    k = back.length;
                                                }
					}
				}
			}
		}
		return array;
	}
}
class Bubble implements Sorter{
	public int[] mathSort(int[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 1; j < array.length - i; j++){
				if(array[j-1] > array[j]){
					int numJ = array[j];
					array[j] = array[j-1];
					array[j-1] = numJ;
				}
			}
		}
		return array;
	}
}
