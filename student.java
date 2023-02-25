package javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class student {
	 int sid;
	 String sname;
	 int marks;
	 public student(int sid, String sname,int marks)
	 {
		 this.sid=sid;
		 this.sname=sname;
		 this.marks=marks;
	 }
	 public void print()
	 {
		 System.out.println(sid+" "+sname+" "+marks);
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(101, "samantha22",495);
		student s2=new student(102, "samantha33",985);
		student s3=new student(103, "samantha44",955);
		student s4=new student(106, "samantha143",195);
		student s10=new student(114, "Dharani", 445);
		List<student> li =new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s10);
		for(int i=0;i<li.size();i++)
		{
			li.get(i).print();
		}
	}

}
