public class BubbleSort {
	
	public static void bubblesort(int[] a) {
		int n = a.length; 
		for (int i = n - 1; i >= 0; i--) {
			for (int k = 0; k < i ; k++) {
				if (a[k+1] < a[k]) {
					swap(a, k, k+1); 
				}
			}
		}
		for (int j = 0; j < n; j++) {
			System.out.println(a[j]);
		}
	}

	public static void swap(int[] a, int less, int greater) {
		int temp = a[less]; 
		a[less] = a[greater];
		a[greater] = temp; 
	}

	public static void main (String args[]) {
		int [] input = {234, 235, 235, 2, 1212, 2, 9, 6, 12, 23, 34, 0, 1}; 
		bubblesort(input); 
	}
}