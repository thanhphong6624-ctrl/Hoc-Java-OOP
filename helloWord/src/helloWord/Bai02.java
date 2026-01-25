package helloWord;

import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("問２　run");

		Scanner scanner = new Scanner(System.in);
		int totalSum = 0;

		while (true) {
			int num = scanner.nextInt();

			if (num == 0) {
				break;
			}
			totalSum += num;
		}
		System.out.println(totalSum);
		scanner.close();
	}

}
