import java.util.HashSet;

// Find 3 numbers in a set whose sum is zero. O(N*N) time

public class ThreeSum {

	public static void threeSum(int a[]){
		HashSet<Integer> h = new HashSet<Integer>(a.length - 1);
		for (int i = 0; i< a.length; i++){
			h.add(a[i]);
		}
		
		for (int i = 0; i< a.length; i++){
			for (int j = i; j< a.length; j++){
				int sum = -1 * (a[i] + a[j]);
				if (h.contains(sum)){
					System.out.println(a[i] + "," + a[j] + "," + sum);
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] anArray = {100, 200, 300, -400, 500, -600, -700, 800, 900};
		threeSum(anArray);
	}

}
