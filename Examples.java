import java.util.*;
import java.io.*;
class Examples 
{
	Scanner sc = new Scanner(System.in);
	// Program to calculate Gcd 
	public void gcd(){
		int gcd =0;
		System.out.println("This Program is used to calculate Greatest Common Factor between two numbers");
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b  = sc.nextInt();
		for (int i=1;i<=a && i<=b ; i++)
		{
			if (a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		System.out.println("GCD of "+a+ " and "+b+" is "+gcd);
	}

	
	// Reverse of a String---
	public void reverse(){
	System.out.println("This Program is to print the reverse of a String-----");
	System.out.print("Enter any String to reverse: ");
	String str = sc.nextLine();
	if (str==null)
	{
		System.out.println("Reverse of String is: "+str);
	}
	StringBuilder input = new StringBuilder();
	input.append(str);
	input = input.reverse();
	System.out.println("Reverse of String "+ str+ "is: "+input);
	}

	// Armstrong Number----
	public void num(){
	System.out.println("This Program is used to check whether a number is Armstrong or Not---");
	System.out.print("Enter any Number: ");
	int n = sc.nextInt();
	int temp = n, sum = 0;
	while (temp>0)
	{
		int m = temp%10;
		sum = sum +(m*m*m);
		temp = temp/10;
	}
	if (sum == n)
	{
		System.out.println("Number "+n+ " is Armstrong number");
	}
	else{
	System.out.println("Number "+n+" is not Armstrong Number");
	}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Examples em = new Examples();
		em.gcd();
		Examples ev = new Examples();
		ev.reverse();
		ev.num();
	}
}
