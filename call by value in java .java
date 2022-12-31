/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void calculateSum(int a, int b){ // this is know as parameters or formal perameters 
        /*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sum is :"+ sum);*/
		int sum = a+b;
		System.out.println("sum is :"+ sum);
		
    }
    
    public static void swap (int a , int b){
        // swap 
		int temp = a ;
		a = b;
		b = temp ;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
        
    }
	public static void main (String[] args) //throws java.lang.Exception
	{
		// swap - values exchange 
		int a = 5 ;
		int b = 10 ;
		swap(a,b);
		// if i do System.out.println("a = "+a);
		//System.out.println("b = "+b); than answer will be original values
        
		
	}
}
