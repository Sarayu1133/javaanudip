
public class GreatestNum {
	public static void main(String[] args)
	{
		int a=58;
		int b=11;
		int c=20;
		int d=45;
		int e=6;
		if(a>b && a>c && a>d && a>e)
		{
			System.out.println("a is greater");
		}
		else if(b>c && b>d && b>e && b>a)
		{
			System.out.println("b is greater");
		}
		else if(c>d && c>e && c>a && c>b)
		{
			System.out.println("c is greater");
		}
		else if(d>a && d>b && d>c && d>e)
		{
			System.out.println("d is greater");
		}
		else
		{
			System.out.println("e is greater");
		}
	}
	

}
