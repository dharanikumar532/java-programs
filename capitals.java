package javaprograms;

import java.util.Set;
import java.util.TreeSet;

public class capitals {
	
	public int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int x=n*fact(n-1);//5*4*3*2*1
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capitals c=new capitals();
		int num=c.fact(5);
		System.out.println(num);
		
	}

}
