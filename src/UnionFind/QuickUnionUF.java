package UnionFind;

public class QuickUnionUF {

	private int[] id;
	
	public QuickUnionUF(int N){
		id = new int[N];
		for (int i=0; i<N; i++){
			id[i] = i;
		}
	}
	
	public int findRoot(int p){
		while (p!=id[p]){
			p = id[p];
		}
		return p;
	}
	
	public boolean isConnected(int p, int q){
		if (findRoot(p) == findRoot(q)){
			return true;
		}
		return false;
	}
	
	public void union(int p, int q){
		int i = findRoot(p);
		int j = findRoot(q);
		id[i] = j;
	
	}
	
	public String printArray(){
		String strArray = Integer.toString(id[0]);
		for (int i=1; i<id.length; i++){
			strArray = strArray + "," + id[i];
		}
		return strArray;
	}

	public static void main(String[] args) {
		QuickUnionUF UF = new QuickUnionUF(7);
		UF.union(0,5);
		UF.union(0,1);
		UF.union(4,6);
		UF.union(2,3);
		UF.union(1, 4);
		System.out.println(UF.printArray());
		System.out.println(UF.isConnected(1, 6));
		
	}
}
