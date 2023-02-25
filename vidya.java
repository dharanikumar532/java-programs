package javaprograms;

import java.util.*;

public class vidya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s= new TreeSet();
		s.add(4);
		s.add(45);
		s.add(55);
		s.add(65);
		s.add(58);
		s.add(65);
		System.out.println(s);
		Set s1=new TreeSet();
		s1.add(45);
		s1.add(55);
		s1.add(44);
		s1.add(58);
		for(Object value:s1)
		{
			System.out.println(value.hashCode());
		}
		
		s1.addAll(s);
		System.out.println(s1);
//		s1.remove(55);
//		System.out.println(s1);
//		System.out.println(s1.size());
//		System.out.println(s1.contains(55));
//		System.out.println(s1.containsAll(s));
//		List li=new ArrayList();
//		li.addAll(s1);
//		System.out.println(li);
//		System.out.println(li.get(0));
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
