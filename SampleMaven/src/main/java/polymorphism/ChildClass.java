package polymorphism;

public class ChildClass extends ParentClass
{
	public void display(int a, int b)
	{
		super.display(3, 2);
		int c = a-b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.display(3, 2);

	}

}
