import java.util.Scanner;

public class FibonaciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,k, count=10;
		
		System.out.println(i);
		System.out.println(j);
		for(i=2;i<count;i++)
		{
			k=i+j;
			System.out.println(" "+k);
			i=j;
			j=k;
		}
		
	}

}
