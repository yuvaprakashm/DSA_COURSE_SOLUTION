/*  Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y


*/

package dsa.practice.week1.problem.set1;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter char :");
		char ch = sc.next().charAt(0);
		sc.close();
		
		System.out.println("\n" + num);
		System.out.println(name);
	    System.out.println(ch);
}
}
