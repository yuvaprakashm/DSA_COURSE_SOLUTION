/* Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 8

Expected output:

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

7 7 7 7 7 7 7 

8 8 8 8 8 8 8 8 



Sample 2

Input:

n= 6

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

*/
package dsa.practice.week2.problem.pattern14;

public class Problem1 {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}
}
