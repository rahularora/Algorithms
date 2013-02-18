// N2 time

package SortingAlgos;

public class Selection {

	public static void sort(Comparable[] arr){
		int N = arr.length;
		
		for (int i=0; i<N ; i++){
			int min = i;
			for (int j=i+1; j<N ; j++){
				if (less(arr[j], arr[j+1]))
					min = j;
			}
			exch (arr, i, min);
		}
	}

	public static void exch(Comparable[] arr, int i, int j) {
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static boolean less (Comparable a, Comparable b){
		return a.compareTo(b) < 0;	
	}
}
