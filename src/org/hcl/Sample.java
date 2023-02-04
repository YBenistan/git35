package org.hcl;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter the number A :"+a);
		int b = s.nextInt();
		System.out.println("Enter the number B :"+b);
		int c = s.nextInt();
		System.out.println("Enter the number C :"+c);
		//int a = 10,b=20,c=30;
		if(a>b&&a>c)
		{
			System.out.println("A is greater :"+a);
		}
		else if (b>a&&b>c) {
			System.out.println("B is greater :"+b);
			
		}
		else
		{
			System.out.println("C is greater :"+c);
		}
		System.out.println("Hai");
		System.out.println("HELLO");
//<<<<<<< HEAD
//=======
//>>>>>>> 6014a86639f3ebd980e3c201f49b345a5042c40a
		
	}

}
