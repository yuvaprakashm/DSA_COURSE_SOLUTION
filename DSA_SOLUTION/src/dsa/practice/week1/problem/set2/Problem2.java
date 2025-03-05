package dsa.practice.week1.problem.set2;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the input :");
		 int x = sc.nextInt();
		 sc.close();
		 for(int i = 1; i * x <= 1000; i++) {
			 System.out.println(i * x);
		 }
	}
}
