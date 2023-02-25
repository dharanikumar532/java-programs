package javaprograms;

import java.util.*;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new PriorityQueue<>();
		String s1="tarak";
		q.offer("nagarjuna");
		q.add("chiranjeevi");
		q.add("prabhas");
		q.add("Tarak");
		q.add("allu arjun");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.contains(q));
	}

}
