package evenorodd;
import java.util.Scanner;
//Program to find the greatest among two integers

public class greatest {

	public static void main(String[] args) {
				int number1,number2;
				System.out.println("enter a number1:");
				Scanner in = new Scanner(System.in);
				number1 = in.nextInt();
				System.out.println("enter a number2:");
				Scanner sc = new Scanner(System.in);
				number2 = sc.nextInt();
				if(number1 > number2)
				{
					System.out.println("num1 is greater");
				}
				else
				{
					System.out.println("num2 is greater");
				}
					
	}

	

}
