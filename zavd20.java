package in_out;

import java.util.Scanner;

public class zavd20 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n % m == 0) {
			System.out.println("1");
		}else {
			if (m % n == 0) {
				System.out.println("1");
			}else {
				System.out.println("3");
			}
			}
		}

}
