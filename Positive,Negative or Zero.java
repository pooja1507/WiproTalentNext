//Program to print whether the number is positive,negative or zero

public class positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter a number:");
		Scanner ts = new Scanner(System.in);
		number = ts.nextInt();
		if(number >= 0)
		{
			if(number == 0)
			{
				System.out.println("zero");
				
			}
			else
			{
				System.out.println("positive");
			}
		}
		else
		{
			System.out.println("negative");
		}

	}

}
