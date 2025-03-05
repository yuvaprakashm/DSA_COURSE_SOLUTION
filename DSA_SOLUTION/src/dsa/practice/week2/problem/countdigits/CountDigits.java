/* Write a program that gets n as input and print the number of digits in the number

Testcase 1 :

Input : 

325345

Expected output:

6



Testcase 2 :

Input : 

9879

Expected output:

4 

 */
package dsa.practice.week2.problem.countdigits;

public class CountDigits {
	public static void main(String[] args) {
		int n = 325345;
		int count = 0;
		while(n > 0) {
			int l = n % 10;
			count = count + 1;
			n = n /10;
		}
		System.out.println(count);
	}
}
