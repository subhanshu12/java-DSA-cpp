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
	public static void main (String[] args) //throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		calculateSum(a,b);// function call value - arguments or actual perameters 
		
	}
}
