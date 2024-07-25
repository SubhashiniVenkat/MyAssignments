package week1.day1;

public class Fibonacci {
	
public static void main(String[] args)
{

	int N = 5;
	int num1 =0;
	int num2 =1;
	
	System.out.println("The fibonacci series is:");
	System.out.println(num1);
	System.out.println(num2);
	
		for (int i=0; i<=N; i++)
	{
				
		int num3 = num1+num2;
		System.out.println(num3);

		num1=num2;
		num2=num3;
	   
	}
	
}

}


