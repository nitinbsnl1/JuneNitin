package pkg1;

public class Abconst1 
{
	public Abconst1()
	{
		System.out.println("deafult constructor");
	}
	
	public Abconst1(int a, int b, int c) 
{
	// TODO Auto-generated constructor stub
	//a = 12;
	//b = 11;
	System.out.println("param");
}
public static void main(String[] args) 
{
	Abconst1 test = new Abconst1();
	Abconst1 test1 = new Abconst1(12,12,10);
}
}

