package pkg1;

public class assignment1
{
int age;
int roll_no;
public void display1()
{
	System.out.println("Enter Age");
}
public void display2()
{
	System.out.println("Enter Roll number");
}
public static void main (String[] args)
{
	assignment1 ass = new assignment1();
    ass.age= 45;
	ass.roll_no=32;
	ass.display1();
	ass.display2();
	System.out.println(ass.roll_no);
}
}

