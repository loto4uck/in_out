package in_out;

import java.util.Scanner;

public class zavd19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n / 1000;
		int n2 = (n - n1 * 1000) / 100;
		int n3 = (n - n1 * 1000 - n2 * 100)/ 10;
		int n4 = n - n1 * 1000 - n2 * 100 - n3 * 10;
		int n12 = n1 + n2;
		int n43 = n4 + n3;
		System.out.println((n43 - n12) + 1);
	}

}
