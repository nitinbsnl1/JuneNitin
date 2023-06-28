package pkg1;

public class assignment3
{
// (((((10*2)-2)+2)-2)/2)
	public int multi(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println("multi result is" + c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int d;
		d = a1-b1;
		System.out.println("Sub result is" + d);
		return d;
	}
	public int add(int a2, int b2)
	{
		int e;
		e = a2+b2;
		System.out.println("add result is" + e);
		return e;
	}
	public int div(int a3, int b3)
	{
		int f;
		f = a3/b3;
		System.out.println("div result is" + f);
		return f;
	}
	public static void main(String[] args)
	{
		assignment3 test  = new assignment3();
		test.multi(10, 2);
		int subresult = test.sub(10, 2);
		int subresult1 = test.sub(10, 4);
		test.add(10, 2);
		test.div(10, 2);
		System.out.println("result" + subresult1);
		}
}

