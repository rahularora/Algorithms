package Stack;

public class StackLL {
	
	Node first;
	
	public StackLL(){
		 first = new Node("Null");
	}
	
	private class Node{
		String item;
		Node next;
		
		public Node(String str){
			this.item = str;
			this.next = null;
		}
		
		public Node(String str, Node n){
			this.item = str;
			this.next = n;
		}
	}
	
	public void push(String item){
		Node temp = new Node(item,first);
		first = temp; 
	}
	
	public String pop(){
		if (!isEmpty()){
			String popItem = first.item;
			first = first.next;
			return popItem;
		}
		return "Stack is empty";
	}

	public boolean isEmpty(){
		if (first.item.equals("Null")){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		StackLL stack = new StackLL();
		stack.push("My");
		stack.push("Name");
		stack.push("is");
		stack.push("Rahul");
		System.out.println(stack.pop());
		stack.push("Anu");
		System.out.println(stack.pop());
	}
}
