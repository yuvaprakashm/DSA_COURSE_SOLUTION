/* Write a program to check whether a triangle can be formed with the given values for the angles.

If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

Input: 45 45 45

Expected Output: 

Triangle cannot be formed

Explanation -> We are getting 3 inputs, that is three angles of triangle, but here the sum of three angles that is 45+45+45 is not equal to 180 so Triangle cannot be formed is the output.
*/
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
