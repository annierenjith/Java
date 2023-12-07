package Inheritance;

public class MathCalculation  extends Calculator{
	public int subtract(int c,int d)
	{
		return(c-d);
	}
	public static void main(String[] args) {
		
		MathCalculation m = new MathCalculation();
		int result =m.add(5, 20);
		System.out.println(result);
		System.out.println(m.subtract(30,15));

	}

	
}
