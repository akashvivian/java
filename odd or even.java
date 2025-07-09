import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
		System.out.println("Enter the number");
		int num=obj.nextInt();
		System.out.println("number="+num);
		if(num%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}
