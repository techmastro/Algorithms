package com.algos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a;

		a= new int[] {2,8,3,6,2,7,1,9,6,8};

		Sort.bubble(a);

		System.out.println("BubbleSort: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		a= new int[] {2,8,3,6,2,7,1,9,6,8};

		Sort.selection(a);
		
		System.out.println("\n\nSelection: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		a= new int[] {2,8,3,6,2,7,1,9,6,8};

		Sort.insertion(a);
		
		System.out.println("\n\nInsertion: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		a= new int[] {2,8,3,6,2,7,1,9,6,8};

		Sort.mergeSort(a, 0, a.length-1);
		
		System.out.println("\n\nMerge: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		a= new int[] {2,8,3,6,2,7,1,9,6,8};

		Sort.quickSort(a, 0, a.length-1);
		
		System.out.println("\n\nQuick: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		a= new int[] {2,8,3,6,2,7,1,9,6,8};

		Sort.qs(a, 0, a.length-1);
		
		System.out.println("\n\nQuick1: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
}
