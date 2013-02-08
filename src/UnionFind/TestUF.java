package UnionFind;

public class TestUF {

	private int[] id;
	
	public TestUF(int N){
		id = new int[N];
		for (int i=0; i<N; i++){
			id[i] = i;
		}
	}

	public boolean isConnected(int p, int q){
		if(id[p] == id[q]){
			return true;
		}
		return false;
	}
	
	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		if(pid < qid){
			id[q] = pid;
		}
		else if (pid > qid){
			id[p] = qid;
		}
		else{
			// do nothing
		}
	}
	
	public String printArray(){
		String strArray = Integer.toString(id[0]);
		for (int i=1; i<id.length; i++){
			strArray = strArray + "," + id[i];
		}
		return strArray;
	}
	
	public static void main(String args[]){
		TestUF UF = new TestUF(7);
		UF.union(0,5);
		UF.union(0,1);
		UF.union(4,6);
		UF.union(2,3);
		UF.union(1, 4);
		System.out.println(UF.printArray());
		// This fails here. If 4,6 is added and 1 is added to 0, later on. 6->4 whereas 4->0
		// making this algo fail
		System.out.println(UF.isConnected(1, 6));
	}

}
