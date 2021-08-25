
import java.util.Scanner;

public class Task4d {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans1 = 0;
        int ans2 = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        n = n-1;
        int s = 1;
        boolean isFound = false;
        //this while loop executes until we found a corresponding numbers s,d altogether with an n that stands within the condition.
        while(isFound == false) {
            int twoPowerNumber = 1;
            //This for loop calculating the value of 2 power the given number s.
            for(int i=1;i<=s;i++) 
        		twoPowerNumber = 2*twoPowerNumber; 

        	if(n%twoPowerNumber ==0 & (n/twoPowerNumber)%2==1) {
        		ans1 = s;
        		ans2 = n/twoPowerNumber;
        		isFound = true;
        	}
        	else 
        		s++;
        }
        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans1);
        System.out.println(ans2);
    }
}