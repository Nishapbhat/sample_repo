package superKeyword;

public class ConstructorChild extends SuperConstructor
{
	public ConstructorChild()
	{
		super();
		int a = 1;
		int b = 3;
		int c = b - a;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		ConstructorChild obj = new ConstructorChild();


	}

}
