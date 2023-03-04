package br.com.ip.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] array  = {1, 5, 2, 3};
		
		System.out.println("Disorderly");
		for(int i: array) {
			System.out.println(i);
		}
		
		selectionSort(array);
		
		System.out.println("Orderly");
		for(int i: array) {
			System.out.println(i);
		}

	}
	
	public static void selectionSort(int[] arr) {
	    
		int n = arr.length;
	    
	    for (int i = 0; i < n-1; i++) {
	        int minIdx = i;
	        
	        for (int j = i+1; j < n; j++) {
	            if (arr[j] < arr[minIdx]) {
	                minIdx = j;
	            }
	        }
	        	
	        int temp = arr[i];
	        arr[i] = arr[minIdx];
	        arr[minIdx] = temp;
	    }
	}


}
