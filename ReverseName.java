import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char ch; 
		String reverse ="";
		
		System.out.println("Enter you name");
		
		String name = input.nextLine();
		int count=name.length();
		
		for(int i=0;i<name.length();i++)
		{
			ch=name.charAt(i);
		
			reverse=ch+reverse;
			
			
		}
		System.out.println(reverse);
	
        
	}
	
	}

}
