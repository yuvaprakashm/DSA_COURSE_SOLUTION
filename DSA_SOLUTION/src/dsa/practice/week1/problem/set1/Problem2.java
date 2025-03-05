package dsa.practice.week1.problem.set1;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle 1 value :");
		int one = sc.nextInt();
		System.out.println("Enter angle 2 value");
		int two = sc.nextInt();
		System.out.println("Enter angle 3 value");
		int three = sc.nextInt();
		sc.close();
		if(one + two + three == 180) {
			System.out.println("triangle can be formed");
		}else {
			System.out.println("triangle cannot be formed");
		}
	}
}
