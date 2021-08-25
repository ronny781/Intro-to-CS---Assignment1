import java.util.Scanner;

public class Isprime {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int X = reader.nextInt();
		
		while (X > 0){
			sum = sum + X;
			X = reader.nextInt();

			
			}
		
		if(sum%2 == 0)
		      System.out.println("Is even");
		else
		      System.out.println("Is odd");
	}
}
