package kata.cengage.bubblesorter;

import java.util.Arrays;

public class BubbleSorter {
	
	public static String getSortedArray(int[] unsortedArray) {
		if(null == unsortedArray){
			return "[ERROR] Invalid Object as Argument";
		}
		
		int[] sorter = {0, 0};
		int switched = 0;
		for(int i = 0; i < unsortedArray.length; i++){
			if(i < unsortedArray.length -1){
				if(unsortedArray[i] > unsortedArray[i+1]){
					sorter[0] = unsortedArray[i+1];
					sorter[1] = unsortedArray[i];
					switched ++;
 				} else {
 					sorter[0] = unsortedArray[i];
					sorter[1] = unsortedArray[i+1];
 				}

				unsortedArray[i] = sorter[0];
				unsortedArray[i+1] = sorter[1];
			}
		}
		if(switched > 0){
			getSortedArray(unsortedArray);
		} 
		
		return Arrays.toString(unsortedArray);
	}

	public static String getSortedArray(float[] unsortedArray) {
		if(null == unsortedArray){
			return "[ERROR] Invalid Object as Argument";
		}
		
		float[] sorter = {0f, 0f};
		int switched = 0;
		for(int i = 0; i < unsortedArray.length; i++){
			if(i < unsortedArray.length -1){
				if(unsortedArray[i] > unsortedArray[i+1]){
					sorter[0] = unsortedArray[i+1];
					sorter[1] = unsortedArray[i];
					switched ++;
 				} else {
 					sorter[0] = unsortedArray[i];
					sorter[1] = unsortedArray[i+1];
 				}

				unsortedArray[i] = sorter[0];
				unsortedArray[i+1] = sorter[1];
			}
		}
		if(switched > 0){
			getSortedArray(unsortedArray);
		} 
		
		return Arrays.toString(unsortedArray);
	}
	
	public static String getSortedArray(String[] unsortedArray) {
		if(null == unsortedArray){
			return "[ERROR] Invalid Object as Argument";
		}

	    int[] convertedArray=new int[unsortedArray.length];
	    int i=0;
	    for(String str:unsortedArray){
	        convertedArray[i]=Integer.parseInt(str);//Exception in this line
	        i++;
	    }
	    String newArray = getSortedArray(convertedArray);
		return newArray;
		
	}

	
}

/****
 * @author crush
 * @NOTES
 * - Another way to do this is to cast everything into Floats, then to 
 * - recast them out when they are to called on strings, or ints.
 * -- 8/28/2013
 */ 
