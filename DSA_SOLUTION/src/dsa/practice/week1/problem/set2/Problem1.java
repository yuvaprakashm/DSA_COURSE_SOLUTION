/* Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.
*/
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
