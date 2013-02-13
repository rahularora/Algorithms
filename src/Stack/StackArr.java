package Stack;

import java.util.Iterator;

public class StackArr <Item> implements Iterable <Item>{
	
	Item[] stack;
	int size;
	
	@SuppressWarnings("unchecked")
	public StackArr(int N){
		stack = (Item[]) new Object[N];
		size = 0;
	}
	
	
	private void push(Item item){
		if(size == stack.length){
			resize (2*stack.length);
		}
		stack[size++] = item;
	}
	
	private void resize(int capacity){
		@SuppressWarnings("unchecked")
		Item[] newStack = (Item[]) new Object[capacity];
		for (int i=0; i<size; i++){
			newStack[i] = stack[i];
		}
		stack = newStack;
	}
	
	private Item pop(){
		Item item = stack[--size];
		if((size > 0) && (size < stack.length/4)){
			resize (stack.length/2);
		}
		return item;
	}
	
	private int getSize(){
		return size-1;
	}

	@SuppressWarnings("unused")
	private boolean isEmpty(){
		if (size > 0){
			return false;
		}
		return true;
	}
	
	public Iterator<Item> iterator() {
		return new StackArrIterator();
	}
	
	public class StackArrIterator implements Iterator<Item>{
		private int i = size;
		
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public Item next() {
			return stack[--i];
		}

		@Override
		public void remove() {
			// Not supported
		}
		
	}
	
	public static void main(String[] args) {
		StackArr<String> stack = new StackArr<String>(20);
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
