package SortingAlgos;

public class Insertion {

	public static void sort(Comparable[] arr){
		int N = arr.length;
		
		for (int i=0; i<N ; i++){
			for (int j=i; j>0; j--){
				if (less (arr[j], arr[j-1]))
					exch (arr, j, j-1);
				else
					break;
			}
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
