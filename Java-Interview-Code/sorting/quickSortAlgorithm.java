import java.util.*;
public class quickSortAlgorithm{
    public static void main(String[] args) {
		int arr[] = {11,12,13,14,15,16,17,10};
		//sort(arr, 0, arr.length-1);
		
		//System.out.println("Sorted Array :"+ Arrays.toString(arr));
		
		int arr2[] = {1, 8, 3, 9, 4, 5, 7};
		sort(arr2, 0, arr2.length-1);
		
		System.out.println("Sorted Array :"+ Arrays.toString(arr2));
	}
	
	static void sort(int[] arr, int l, int r) {
		System.out.println("This is left: " + l);
		if (l < r) {
			int p = partition(arr, l, r);
            System.out.println("This is p higher: " + p);
			sort(arr, l, p-1);
            System.out.println("This is p lower: " + p);
			sort(arr, p+1, r);
		}
	}
	
	static int partition(int arr[], int l, int r) {
		// Take last element as pivot.
		int pivotIndex = r;
        System.out.println("This is the pivot index: " + pivotIndex);
		int pivot = arr[pivotIndex];
        System.out.println("This is the value " + arr[pivotIndex]);
		// This is a special variable that will keep track of the first
		// element from the left of the array that is greater than the pivot.
		int indexOfFirstElementGreaterThanPivot = l;
        System.out.println("This is the left: " + indexOfFirstElementGreaterThanPivot);
		
		for(int i=l;i<r;i++) {
            System.out.println("This is I: " + i);
			if(arr[i] <= pivot) {
				// When you find an element smaller than pivot
				// exchange it with first element greater than pivot.
				swap(arr, i, indexOfFirstElementGreaterThanPivot);
				indexOfFirstElementGreaterThanPivot ++;
                System.out.println("This is new pivot index: " + indexOfFirstElementGreaterThanPivot);
			}
		}
		
		// position pivot at the right place by swapping it with
		// first element greater than pivot.
		swap(arr, indexOfFirstElementGreaterThanPivot, pivotIndex);
		int newPivotIndex = indexOfFirstElementGreaterThanPivot;
        System.out.println("new pivot: " + newPivotIndex);
		
		return newPivotIndex;
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
        System.out.println("Changed array :" + Arrays.toString(arr));

	}
} 
