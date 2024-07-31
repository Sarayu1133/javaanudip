import java.util.Scanner;
public class GreatestOfThree {
	public static void main(String[] args)
	{
		//Declare variables to store three numbers

		int n1,n2,n3;
		// Input of data through keyborad
		System.out.println("Enter three numbers:");
		// Create a Scanner object to read input from the user
		Scanner sc= new Scanner(System.in);
		// Read three integers from the user
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		// Determine and print the largest number among n1, n2, and n3
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" is largest");
		}
		else if(n2>n3 && n2>n3)
		{
			System.out.println(n2+" is largest");
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println(n3+" is largest");
		}
		else
		{
			System.out.println("All numbers are equal");
			
		}
		
		sc.close();
		
  
	}

}
