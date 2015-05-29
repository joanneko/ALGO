public class SelectionSort {
	public static void main (String args[]) {
		int[] a = {6, 5, 4, 235, 2, 32, 55, 1};
		selectionsort(a); 


	}

	public static void selectionsort (int[] a) {
		int n = a.length; 
		for (int i = 0; i < n; i++) {
			int min = i; 
			// int min = a[i]; 
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j; 
				}
			}
			int temp = a[i]; 
			a[i] = a[min]; 
			a[min] = temp; 

		}
		for (int k = 0; k < n; k++) {
			System.out.println(a[k]); 
		}
	}
}