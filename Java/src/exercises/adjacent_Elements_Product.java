package exercises;

public class adjacent_Elements_Product {
	/*
	Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

	Example
	
	For inputArray = [3, 6, -2, -5, 7, 3], the output should be
	solution(inputArray) = 21.
	
	7 and 3 produce the largest product.
	*/
	
	int solution(int[] inputArray) {
	      int aux = -1000;
	      
	    for(int i=0; i<inputArray.length-1;i++){
	        inputArray[i] = inputArray[i]*inputArray[i+1];
	        if(inputArray[i] > aux){
	            aux = inputArray[i];
	        }
	    }
	    return aux;      
	}
}
