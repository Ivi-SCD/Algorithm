package br.com.ip.sort;

public class InsertionSort {
	
	public static void main(String [] args) {
		
		int [] array  = {1, 5, 2, 3};
		
		System.out.println("Disorderly");
		for(int i: array) {
			System.out.println(i);
		}
		
		insertionSort(array);
		
		System.out.println("Orderly");
		for(int i: array) {
			System.out.println(i);
		}
		
	}
	
	public static void insertionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = key;
	    }
	}

	
}
