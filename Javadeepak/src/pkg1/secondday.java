package pkg1;

public class secondday
{
public int sum(int a,int b)
{
	int d;
	d = a+b;
	System.out.println("sum result is" + d );
	return d;
}
public int sub(int a1, int a2)
{
	int a3;
	a3 = a1-a2;
	System.out.println("sub result is" + a3);
	return a3;
}
public void multi(int m1, int m2)
{
	int n;
	n = m1*m2;
	System.out.println("multi result is" + n);
	}
public static void main(String[] args) 
{
secondday abc = new secondday();
int subresult = abc.sum(10, 2);
int subresult1 = abc.sub(21, 10);
abc.multi(12, 3);
System.out.println("sum result again" + subresult);
}
}


