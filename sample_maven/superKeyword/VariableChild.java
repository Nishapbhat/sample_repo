package superKeyword;

public class VariableChild extends SuperVariable
{
	String colour = "pink";
	public void print()
	{
		System.out.println(super.colour);
		System.out.println(colour);
	}
	public static void main(String[] args) 
	{
		VariableChild obj = new VariableChild();
		obj.print();

	}

}
