//To check whether number is palindrome or not
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		//Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		//Prompt the user to enter a number 
		System.out.print("Enter a number :");
		//Read the integer input from user 
		int num = sc.nextInt();
		int backup = num;
		int rev =0;
		
		while (num > 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (backup == rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
