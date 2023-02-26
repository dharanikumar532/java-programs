package javaprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
	String s[]= {"dharani","kumar","java","python","kumar","true"};
	boolean flag=false;
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length-1;j++)
		{
			if(s[i]==s[j])
			{
		
		System.out.println("duplicate element is  "+s[i]);
	
		flag=true;
		
		}
		}
	}
	if(flag==false)
	{
		System.out.println("element is not found");
	}
}
}