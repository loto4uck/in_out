package in_out;

import java.util.Scanner;

public class zavd11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n / 3600;
		int b = n % 3600 / 60;
		int c = n % 3600 % 60;
		System.out.println((( a / 10 + "" + a % 10)+":"+(b / 10 + "" + b % 10)+":"+( c / 10 + "" + c % 10)) );
		}

}
