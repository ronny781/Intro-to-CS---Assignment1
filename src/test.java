
import java.util.Arrays;
import java.util.Scanner;

public class test {
	

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannner = new Scanner(System.in);
		int d = 200123;
		int n = 400247;
		int b = 25000;
		int  moduloResult =1;
		for(int r = 0;r<d;r++) {
        	moduloResult=((moduloResult%n)* (b%n))%n;
		System.out.println(moduloResult);}
			System.out.println(moduloResult);
			moduloResult =1;
		for(int r = 1;r<=d;r++) 
    	moduloResult= (moduloResult * b)%n;
	
		System.out.println(moduloResult);
		System.out.println(Integer.MAX_VALUE);
		}
		
	
		
		
	

}
