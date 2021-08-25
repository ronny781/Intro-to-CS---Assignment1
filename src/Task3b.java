
import java.util.Scanner;

public class Task3b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a;
        // There are two scenarios. when n is bigger then 30 and smaller. I divided these scenarios for 2 cases.
        // I divided this to two separate cases because we can't contain number 2 power number that is bigger then 30 in int type.
        // First scenario:
        if(n<31) {
        	ans = 2;
            for(int i=0;i<n-1;i++) 
            	ans= 2 * ans; 
            ans = ans %k;
        	}
        //Second scenario:(if n is bigger than 30 then the code calculates (2 power 30)%k .
        //Every time it get into the loop again it accumulates the multiplication of (2 power 30)%k and deducts 30 from n.
        //When n is finally less than 30 it will go into another if statement and calculate(2 power (n%30) 
        // Example: if n= 65, then the while loop going to be executed twice (65-30 = 35, 35-30 = 5, 5<30) then it will go to the if statement in the end.
        if(n>30) {
        	int p = 2;
        	 ans = 1;
        	 for(int i = 0; i<29;i++) 
    			 p = 2 * p;
        	 p=p%k;
        	
        	 while(n>30) { 
        		 ans = ans *p;
        		 n = n -30;
        		 
        	 }
        	 if(n<=30 & n>0) {
        		 a = n;
        		 int b=2;
        		 for(int i = 0; i< a-1; i++)
        			 b = 2*b;
        		 b = b % k ;
        		 ans = ans * b ;
        		 ans = ans % k ;
        		 
        	 }
        	
        }
        
        
        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);
    }
}