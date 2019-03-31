import java.util.ArrayList;
//GenericQueue Class descrived in Exericse 4. 
public class GenericQueue<T> {
	private ArrayList<T> queue;
	public int cursor;
	public GenericQueue(){
		queue = new ArrayList<T>();
	}	
	public void enqueue(T item) {
		queue.add(item);
	}
	public T dequeue() {
		if ( size() > 0) {
			T returnValue = queue.get(0);
			queue.remove(0);
			return returnValue;
		}
		return null;	
	} 
	public int size() {
		return queue.size();
	}
	public boolean isEmpty() {
		return(queue.size()==0);
	}
	public void clear() {
		while (!(isEmpty()))
			dequeue();
	}
	public T peek() {
		if (size()>0) { 
			T returnValue = queue.get(0);
			return returnValue;
		}
		else
			return null;
	}
	public int positionOf(T item){
		if (first() == item)
			return (cursor-1);
		else
			while (cursor<size()) 
				if (next()==item) //this function increases cursor after the check so in order to return the desired index we subtract 1.
					return (cursor-1);
		return -1;
	}
	public void remove(T item){ 
		if (first() == item)
			dequeue();
		else
			while (cursor<size()-1) {
				if (next()==item)  //this function incremnets cursor after the check so in order to remove the desired item we subtract 1.
					queue.remove(cursor-1); 
			}
	}
	public T first(){
		cursor = 0;
		return peek();
	}
	public T next(){
		if (cursor > size())
			return null;
		else {
			cursor++;  // This is reason for the -1's sprinkled into "public int positionOf(T item)" & "public void remove(T item)" 
			return queue.get(cursor-1);
		}
	}
}