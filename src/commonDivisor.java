
public class commonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean commonDivisor = false;
    	 int p =2 ;
    	 int ans = 8;
    	 int counter = 0;
    	 int n = 32;
    	 while(p<=ans & !commonDivisor) {
    		 if(ans%p==0 & n%p == 0) {
    			 commonDivisor = true;
    			 System.out.println(p);
    			 counter++;
    			 
    		 }
    		 else
    			 p = p+ 1;
    	 }
    	 if(commonDivisor) {
    		 System.out.println("there is a common divisor");
    		 System.out.println((4*50)/3);
    	 System.out.println(counter);}
    	 else
    		 System.out.println("there isnt common divisor");
	}

}
