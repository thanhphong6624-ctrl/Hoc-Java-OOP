package helloWord;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("問03");

		Scanner scanner = new Scanner(System.in);
		System.out.print("入力：");
		int num = scanner.nextInt();
		int i = 1;
		while (i <= num) {
			int u = 1;
			while (u <= i) {
				System.out.print("*");
				u++;
			}
			System.out.println();
			i++;
		}

		scanner.close();
	}

}
