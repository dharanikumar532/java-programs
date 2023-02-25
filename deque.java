package javaprograms;
import java.util.*;
public class deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> a=new ArrayDeque<>();
		a.add("Kohli");
		a.add("Dhoni");
		a.add("sachin");
		a.add("Ganguli");
		System.out.println(a);
		a.addFirst("yuvraj");
		System.out.println(a);
		a.addLast("bumrah");
		System.out.println(a);
		System.out.println(a.remove());
		System.out.println(a);
		System.out.println(a.removeLast());
		
		System.out.println(a.pollFirst());
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a);
		
	LinkedList li=new LinkedList<>();
		li.addFirst("1245");
		li.offer(45);
		li.offerFirst("4756");
		li.offerLast(4785323);
		System.out.println(li);
	}

}
