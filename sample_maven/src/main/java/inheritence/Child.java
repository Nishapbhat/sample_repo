package inheritence;

public class Child extends Parent
{
	public void child()
	{
		System.out.println("this is child class");
	}
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.child();
		obj.parent();
		obj.grandParent();
	}

}
