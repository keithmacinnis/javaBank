//A tester class for Exericse 4's Generic Queue:
public class GenericQueueDemo {
	public static void main(String[] args) {
		GenericQueue<String> q1 = new GenericQueue<String>();
			q1.enqueue("London");
			q1.enqueue("Paris");
			q1.enqueue("Halifax");
		GenericQueue<Integer> q2 = new GenericQueue<Integer>();
			q2.enqueue(1);
			q2.enqueue(2);
			q2.enqueue(3);
		System.out.println("Size: "+q1.size() + "\n IsEmpty?: "+q1.isEmpty() +"\n Peek : " +q1.peek() + "\n Positon of Pari: " + q1.positionOf("Paris") );
		System.out.println("!!!!!!!!!!Remove Paris!!");
		q1.remove("Paris");
		System.out.println("Size: "+q1.size() + "\n IsEmpty?: "+q1.isEmpty() +"\n Peek : " +q1.peek() + "\n Positon of Paris: " + q1.positionOf("Paris") );
		System.out.println("!!!!!!!!!!Clear the Queue!");
		q1.clear();
		System.out.println("Size: "+q1.size() + "\n IsEmpty?: "+q1.isEmpty() +"\n Peek : " +q1.peek() + "\n Positon of Paris: " + q1.positionOf("Paris") );
		System.out.println("dequeue, dequeue, dequeue, dequeue!!!");
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
	}
}