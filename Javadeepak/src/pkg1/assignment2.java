package pkg1;

public class assignment2 
{
	//((((10+2)+2)-2)*2)/2)
public int sum(int a, int b)
{
	int c;
	c = a+b;
	System.out.println("sum result is" + c);
	return c;
}
public int sub(int a1, int b1)
{
	int d;
	d = a1-b1;
	System.out.println("sub result is" + d);
	return d;
}
/*public int multi(int a2, int b2)
{
	int e;
	e = a2*b2;
	System.out.println("multi result is" + e);
	return e;
}*/
public void multi(int a2, int b2)
{
	int e;
	e = a2*b2;
	System.out.println("multi result is" + e);
}

/*public int div(int a3, int b3)
{
	int f;
	f = a3/b3;
	System.out.println("div result is" + f);
	return f;
	}*/
public void div(int a3, int b3)
{
	int f;
	f = a3/b3;
	System.out.println("div result is" + f);
}

public static void main(String[] args)
{
	//((((10+2)+2)-2)*2)/2)
	assignment2 test = new assignment2();
	int subresult = test.sum (10, 2);
	int subresult1 = test.sum(subresult, 2);
	int subresult2 = test.sub (subresult1, 2);
	test.multi (subresult2, 2);
	//test.div (subresult3, 2);
	//System.out.println("result" + subresult );
}
}
