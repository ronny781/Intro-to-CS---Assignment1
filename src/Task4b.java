
import java.util.Scanner;

public class Task4b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------

        int max = scanner.nextInt();
        int n = 2;
        	while (n <= max) {
        boolean isPrime = true;
        int p = 2;
        //i used p*p because we learned at the class that it's more efficient then continue searching  till 'n' and we proved it!
        	while (p*p <= n & isPrime) {
        		if (n%p == 0) {
        			isPrime = false;
        		}
        		p = p + 1;
        }
        	if(isPrime) {
        		ans++;
        	}
        	n = n + 1;
        }
        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);        
    }
}