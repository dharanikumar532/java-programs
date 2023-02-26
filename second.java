package javaprograms;

public class second
{
	String name;
	int id;
	public second(int eid,String ename)
	{
		name=ename;
		id=eid;
		System.out.println(id+ " "+"\t"+name);
	}
	public static void main(String[] args) {
		
	}
	

}
class employee
{
	public static void main(String[] args) {
		second[] s=new second[1];
		s[0]=new second(2,"dharani" );
		s[0].id=12;

}
}

	

	


