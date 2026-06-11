package superKeyword;

public class MethodChild extends SuperMethod
{
	public void display()
	{
		super.display();
		System.out.println("this is the child class");
	}
	public static void main(String[] args) 
	{
		MethodChild obj = new MethodChild();
		obj.display();
	}

}
