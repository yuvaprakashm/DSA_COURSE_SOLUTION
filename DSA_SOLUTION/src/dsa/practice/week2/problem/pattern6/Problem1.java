/* Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

****

***

**

*



Sample 2

Input:

n= 6

******

*****

****

***

**

*

*/
package dsa.practice.week2.problem.pattern6;

public class Problem1 {
	public static void main(String[] args) {
		int n = 6;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
