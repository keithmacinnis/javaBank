package ca.dal.cs.schememm.common;
import java.util.ArrayList;
public class Stack<T> {
	private ArrayList<T> stack;
	public Stack(){
		stack = new ArrayList<T>();
	}
	public int size(){
		return stack.size();
	}
	public T peek(){
 		return stack.get(stack.size()-1);
	}
	public T pop() {
		T returnValue = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);	
		return returnValue;
	}
	public void push (T element) {
		stack.add(element);
	}
	public boolean isEmpty() {
		return(stack.size()==0);
	}
	public void itterate() {
		for (T t: stack)
		   	System.out.println(t.toString());
	}
}