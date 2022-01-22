import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int primeNumber=input.nextInt();
		if(primeNumber%primeNumber==0&&primeNumber%1==0)
		{
			System.out.println("Your enterned is a prienuber");
		}
		else
		{
			System.out.println("Your enterned is not a prienuber");
		}
		
		

	}

}
