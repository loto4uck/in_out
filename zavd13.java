package in_out;

import java.util.Scanner;

public class zavd13 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		a = a * 45 + (a / 2) * 5 + ((a + 1) / 2 - 1) * 15;
		System.out.println(a / 60 + 9 + " " + a % 60);
	}

}
