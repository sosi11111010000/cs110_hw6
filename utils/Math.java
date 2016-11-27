package utils;

public class Math {
	public static int factorial(int n){
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	
	public static int factorialLoop(int n){
		int fac=1;
		
		for(int i = n; i > 0; i--)
		{
			fac*=i;
		}
		
		return fac;
	}
	
	
	public static void main(String[] args){
		System.out.println(Math.factorialLoop(6));
		
	}
	
	
}
