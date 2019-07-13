package com.algos;

public class Sort {

	public static void bubble(int[] a) {
		
		for (int pass = a.length; pass >=0; pass--) {
			
			for(int i=0;i<pass-1;i++) {

				if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}

			}

		}
	}
	
	public static void selection(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			int temp = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[temp] > a[j]) {
					int tValue = a[temp];
					a[temp] = a[j];
					a[j] = tValue;
				}
			}
		}
		
	}

	public static void insertion(int[] a) {

		for(int i=1;i<=a.length-1;i++) {
			int v = a[i];
			int j=i;
			
			while(j>=1 && a[j-1]>v) {
				a[j] = a[j-1];
				
				j--;
			}
			
			a[j] = v;
			
		}

	}
	
	public static void mergeSort(int[] a, int left, int right) {

		if(right>left) {
			int mid = (left + right)/2;
			mergeSort(a,left, mid);
			mergeSort(a,mid+1,right);
			merge(a,left,mid+1,right);
		}
		
	}
	
	private static void merge(int[] a, int left, int mid, int right) {
		
		int left_end = mid - 1;
		int temp_pos = 0;
		int size = right -left +1;
		int[] temp = new int[size];
		while((left<=left_end) && (mid<=right)) {
			if(a[left]<=a[mid]) {
				temp[temp_pos] = a[left];
				temp_pos++;
				left++;
			}
			else {
				temp[temp_pos++] = a[mid++];
//				temp_pos++;
//				mid++;
			}
		}
		
		while(left<=left_end) {
			temp[temp_pos++] = a[left++];
//			temp_pos++;
//			left++;
		}
		
		while(mid<=right) {
			temp[temp_pos++] = a[mid++];
//			temp_pos++;
//			mid++;
		}
		
		for(int i=size-1;i>=0;i--) {
			a[right] = temp[i];
			right--;
		}
		
	}
	
	public static void quickSort(int[] a, int low, int high) {
		if(high>low) {
			int pivot = partition(a,low,high);
			quickSort(a, low, pivot-1);
			quickSort(a,pivot+1,high);
		}
	}
	
	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int left = low;
		int right = high;
		
		while(left<right) {
			
			while(a[left]<=pivot) {
				left++;
			}
			
			while(a[right]>pivot) {
				right--;				
			}
			
			if(left<right) {
				swap(a,left,right);
			}
			
		}
		
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}
	
	private static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	public static void qs(int[] a, int low, int high) {
		if(low<high) {
			int p = p1(a,low,high);
			qs(a,low,p-1);
			qs(a,p+1,high);
		}
	}
	
	private static int p1(int[] a, int low, int high) {
		int k=low-1;
		int temp=0;
		
		for(int i=low;i<high;i++) {
			if(a[i]<a[high]) {
				k++;
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
		
		k++;
		temp = a[k];
		a[k] = a[high];
		a[high] = temp;
		
		return k;
	}

}
