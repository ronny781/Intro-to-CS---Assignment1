
import java.util.Scanner;

public class Task3a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        // n=0 and n=1 are both edge cases so the code will manage to deal with them manually.
        int n = scanner.nextInt();
        if(n==0) {
        	ans=1;
        }
        if(n==1) {
        	ans=2;
        }
        if(n>1) {
        	ans = 2;
            for(int i=0;i<n-1;i++) 
            	ans= 2 * ans; 
        	}
        
        //---------------write your code ABOVE this line only!--------------
        
        System.out.println(ans);
    }
}