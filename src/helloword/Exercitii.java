package helloword;

import java.util.Scanner;

public class Exercitii {
	public static void main(String[] args) {
		
    	 int K = 5;
    	 int I = -2;
    	 
    	 while(I <= K) {
    		 I=I+2;
    		 K=K-1;
    		 
    		 System.out.println(I+K);
    		 
    		 
    	 }
    	 
    	 
    	 int number = 4;
    	 while(number >= 0) {
    		 
    	   number--; // number = number-1;
    	   
    	   System.out.println(number);
    	   
    	 
    	   
    	   //for loops 
    	   
    	   
    	 }
    	 
    	 
    	 System.out.println("Problema for loop");
    	 
    	 int sum = 0;
    	 
    	 for(int j = 1; j <=10; j++) {
    		 sum = sum +j; 
    		 System.out.println(j);
    		
    		 
    	 }
    	 System.out.println("The Sum is:" + sum);
    	 
    	 
    	 Scanner input = new Scanner(System.in);
    	 
    	       System.out.println("Test Data:");
    	       
    	       System.out.println("Input the 10 numbers:");
    	       
    	       int t = input.nextInt();
    	       
    	       System.out.println("Number-1:" + t);
    	       
    	       
    	   for(int j = 1; j<=10; j++) {
    		   sum = sum +j;
    		   System.out.println("The sum of 10 no is:" +sum);
    	   }
	}
}
