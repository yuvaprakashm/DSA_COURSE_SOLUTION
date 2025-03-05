package dsa.practice.week1.problem.set2;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X :");
		int x = sc.nextInt();
		System.out.println("Enter value of Y :");
		int y = sc.nextInt();
		sc.close();
		for(int i=0; i<y; i++) {
			System.out.println(x);
		}
	}
}
