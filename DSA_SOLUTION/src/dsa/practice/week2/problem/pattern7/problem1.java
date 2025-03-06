/* 
Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

4321

321

21

1



Sample 2

Input:

n= 6

654321

54321

4321

321

21

1  

*/
package dsa.practice.week2.problem.pattern7;

public class problem1 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
