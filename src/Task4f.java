
import java.util.Scanner;

public class Task4f {

    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        boolean ans = true;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int k = scanner.nextInt(); 
        for(int c = 0;c<k &ans;c++) { // loop of test execution k times.
        	int b = (int) (Math.random() * ((n-1)-2 + 1)) +2 ;
        	int i = 0;
            int moduloResult = 1;
            boolean condition = true;
            for(int r = 0;r<d;r++) 
            	moduloResult=((moduloResult%n)* (b%n))%n;
            if(moduloResult!=1) // first term check
                condition = true;
                else 
                	condition = false; 
           
        	while(condition  & i<s) { // second term check
                int exponent = 1;
                //calculation of exponent of b
                
                for(int j=0;j<i;j++) 
        			exponent = 2*exponent;		   
        		
                exponent = exponent *d ;
        		
        		// calculation of modulo of second term
        		moduloResult = 1;
        		for(int r = 0;r<exponent;r++) 
        	        	moduloResult=((moduloResult%n)* (b%n))%n;
        		
        		if(moduloResult == n-1) 
    				condition = false;	
    			else 
    				i++;
        		
        	}
        	if(condition)  // Declaration that the number is a composite number
        		ans = false;
        	else 
        		ans= true; // Declaration that the number is a prime number
        	}
 	
        //---------------write your code ABOVE this line only!--------------
      
        	
        
        System.out.println(ans);
    }
}