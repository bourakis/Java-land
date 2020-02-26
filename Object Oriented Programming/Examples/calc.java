public class Calculator 
{
	int num1;
	int num2;
	
	public Calculator(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
	
	public int add()
	{
		return num1 + num2;
	}
	
	public int sub()
	{
		return num1-num2;
	}

	public int mul()
	{
		return num1*num2;
	}

	
	public static void main(String []args) 
	{
	    int result;
		
	    Calculator calc1 = new Calculator(10,5);
	     
	    result = calc1.add();
	    System.out.println("Sum: " + result);
	     
	    result = calc1.sub();
	    System.out.println("Sub: " + result);
	     
	    result = calc1.mul();
	    System.out.println("Mul: " + result);
	}
}
