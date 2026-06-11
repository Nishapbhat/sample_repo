package inheritence;

public class Child2 extends Parent
{
	public void child2()
	{
		System.out.println("this is child2 class");
	}
	public static void main(String[] args) 
	{
		Child2 obj = new Child2();
		obj.child2();
		obj.parent();
	}

}
