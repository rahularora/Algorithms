package UnionFind;

public class QuickFindUF {
	
	private int[] id;
	
	public QuickFindUF(int N){
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
			for (int i=0; i<id.length; i++){
				if (id[i] == qid){
					id[i] = pid;
				}
			}
		}
		else if (pid > qid){
			for (int i=0; i<id.length; i++){
				if (id[i] == pid){
					id[i] = qid;
				}
			}
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
		QuickFindUF UF = new QuickFindUF(7);
		UF.union(0,5);
		UF.union(0,1);
		UF.union(4,6);
		UF.union(2,3);
		UF.union(1, 4);
		System.out.println(UF.printArray());
		System.out.println(UF.isConnected(1, 6));
	}
}
