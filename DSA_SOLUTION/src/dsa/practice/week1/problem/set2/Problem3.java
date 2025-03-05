/*  Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.
 */
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
