package SearchingAlgos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

	public static int findKey(int a[], int key){
		int lo = 0;
		int hi = a.length - 1;
		
		while (lo <= hi){
			int mid = (lo + hi)/2;
			if (key < a[mid]){
				hi = mid - 1;
			}
			else if(key > a[mid]){
				lo = mid + 1;
			}
			else{
				return mid;
			}
		}
		
		return -1;
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter key to be searched : ");
		System.out.println("At index " + findKey(anArray, Integer.parseInt(in.readLine())));
	}

}
