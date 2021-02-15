package sravani;

import java.util.Scanner;

public class FactorialApp {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int n;
	int fact=1;
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+n+" is: "+fact);
	System.out.println("completed");
}
}
