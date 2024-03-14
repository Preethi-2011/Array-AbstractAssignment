

abstract class Addition{
	
	abstract void add();
	
	public void sub()
	{
		System.out.println("Subraction");
	}
}

abstract class ImplementedMethod extends Addition{
	abstract void division();
	public void multipy()
	{
		System.out.println("Multiplication");
	}
}	

public class example extends ImplementedMethod {
	void add() {
		System.out.println("Addition");
	}
	void division() {
		System.out.println("Division");
	}
	

	public static void main(String[] args) {
		example c =new example();
		c.add();
		c.sub();
		c.multipy();
		c.division();
		
	}

}
