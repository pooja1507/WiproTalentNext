package evenorodd;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		
		
		if(number%2 == 0)
		{
			System.out.println("even");
			
		}
		else
		{
			System.out.println("odd");
		}

	}

}
