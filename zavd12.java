package in_out;

import java.util.Scanner;

public class zavd12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		b = b - a;
		b = -b;
		a = a - b;
		System.out.println(a + " " + b);
		}

}
