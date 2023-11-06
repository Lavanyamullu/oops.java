import java.util.*;
public class Listierator
{
	public static void main(String[] args) {
		System.out.println("ListIterator");
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		ListIterator<Integer> b=a.listIterator();
		while(b.hasNext()){
		    System.out.println(b.next());
		}
		while(b.hasPrevious()){
		    System.out.println(b.previous());
		}

	}
}
//import java.util.*;
//public class Main{
	//public static void main(String[] args) {
		//System.out.println("Hello World");
		//Queue<Integer> a=new PriorityQueue<>();
		//a.add(10);
		//a.add(20);
		//a.add(30);
		//a.offer(45);
		//a.offer(55);
		//System.out.println(a);
		//System.out.println(a.peek());
		//System.out.println(a.element());
		//System.out.println(a.remove(30));
		//System.out.println(a.poll());
	//}}
//import java.util.*;
//public class Main{
	//public static void main(String[] args) {
		//System.out.println("priority queue");
		//PriorityQueue<Integer> a=new PriorityQueue<>();
		//a.add(10);
		//a.add(20);
		//a.add(30);
		//a.offer(5);
		//a.offer(3);
		//System.out.println(a);
		//System.out.println(a.peek());
		//System.out.println(a.element());
		//System.out.println(a.remove(30));
		//System.out.println(a.poll());
	

	//}}
//import java.util.*;
//public class Main{
	//public static void main(String[] args) {
		//System.out.println("priority queue");
		//Queue<Integer> a=new LinkedList<>();
		//a.add(10);
		//a.add(20);
		//a.add(30);
		//a.offer(5);
		//a.offer(3);
		//System.out.println(a);
		//System.out.println(a.peek());
		//System.out.println(a.element());
		//System.out.println(a.remove(30));
		//System.out.println(a.poll());
	

	//}}
