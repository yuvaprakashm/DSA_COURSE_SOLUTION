package dsa.practice.week1.problem.set2;

import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter FirstName :");
	String fName = sc.next();
	System.out.println("Enter SecondName :");
	String sName = sc.next();
	int n = sc.nextInt();
	sc.close();
	String eName = fName + sName;
	for(int i = 0; i < n; i++) {
		System.out.println(eName);
	}
}
}
