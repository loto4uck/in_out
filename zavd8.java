package in_out;

import java.util.Scanner;

public class zavd8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println((n % 10) + (n % 100 / 10) + (n % 1000 / 100));

    }

}
