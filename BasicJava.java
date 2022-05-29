package workshop1;

import java.util.Scanner;

public class BasicJava {
	public static void main(String[] args) {
		// First Question--------
		System.out.println("Hello");
		System.out.println("Santhosh Naik");
		
		// Second Question-------
		int num1=11;
		int num2=22;
		System.out.println(num1+"!="+num2+"->"+(num1!=num2));
		System.out.println(num1+"<"+num2+"->"+(num1<num2));
		System.out.println(num1+"<="+num2+"->"+(num1<=num2));
		//Third Question=Sum of digits-------
		int a=2;
		int b=5;
		int c;
		//For Addition
		c=a+b;
		System.out.println("Addition of two numbers:" +c);
		//For Subtraction
		c=a-b;
		System.out.println("Subtrction of two numbers:" +c);
		//For Multiplication
		c=a*b;
		System.out.println("Multiplication of two numbers:" +c);
		//for Division
		c=a/b;
		System.out.println("Division of two numbers:" +c);
		//for Reminder
		c=a%b;
		System.out.println("Remider of two numbers:" +c);
		
		
		  int n,sum;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number: "); 
		  n=sc.nextInt();
		  System.out.println("Number is :"+n);
		   for(sum=0;n!=0;n=n/10) { sum=sum+n%10; }
		  System.out.println("Sumx of digit: "+sum);
		

	}



}
