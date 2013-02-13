package Stack;

import java.util.Iterator;

public class StackLL <Item> implements Iterable <Item>{
	
	Node first;
	
	@SuppressWarnings("unchecked")
	public StackLL(){
		 first = new Node((Item) "Null");
	}
	
	private class Node{
		Item item;
		Node next;
		
		public Node(Item str){
			this.item = str;
			this.next = null;
		}
		
		public Node(Item str, Node n){
			this.item = str;
			this.next = n;
		}
	}
	
	public void push(Item item){
		Node temp = new Node(item,first);
		first = temp; 
	}
	
	public Item pop(){
		if (!isEmpty()){
			Item popItem = first.item;
			first = first.next;
			return popItem;
		}
		return null;
	}

	public boolean isEmpty(){
		if (first.item.equals("Null")){
			return true;
		}
		return false;
	}
	
	public Iterator<Item> iterator() {
		return new StackListIterator ();
	}
	
	public class StackListIterator implements Iterator <Item>{
		private Node current = first;
		@Override
		public boolean hasNext() {
			return current !=null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// Not supported
		}
		
	}
	
	public static void main(String[] args) {
		StackLL<String> stack = new StackLL<String>();
		stack.push("My");
		stack.push("Name");
		stack.push("is");
		stack.push("Rahul");
		System.out.println(stack.pop());
		stack.push("Anu");
		System.out.println(stack.pop());
		
		for (String s:stack){
			System.out.print(s + " , ");
		}
	}
}
