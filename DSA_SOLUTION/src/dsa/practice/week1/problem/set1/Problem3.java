package dsa.practice.week1.problem.set1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark : ");
		int mark = sc.nextInt();
		sc.close();
		if (mark > 100 || mark < 0) {  
			System.err.println("Invalid mark. Please enter a value between 0 and 100.");
		} else if (mark >= 90) {
			System.out.println("Grade A");
		} else if (mark >= 80) {
			System.out.println("Grade B");
		} else if (mark >= 60) {
			System.out.println("Grade C");
		} else if (mark >= 35) {
			System.out.println("Grade D");
		} else {
			System.err.println("Fail");
		}
	}
}