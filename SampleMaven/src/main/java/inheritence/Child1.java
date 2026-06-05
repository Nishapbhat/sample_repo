package inheritence;

public class Child1 extends Parent
{
	public void child1()
	{
		System.out.println("this is child1 class");
	}
	public static void main(String[] args) 
	{
		Child1 obj = new Child1();
		obj.child1();
		obj.parent();
	}

}
