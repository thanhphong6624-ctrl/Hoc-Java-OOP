package helloWord;

import java.util.Scanner;

class Bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("問 01 run");

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int min = Integer.MAX_VALUE;

		while (count < 3) {
			System.out.print("入力：");
			int number = scanner.nextInt();
			if (number < min) {
				min = number;
			}
			count++;
		}
		scanner.close();
		System.out.println("最小値は " + min + " です。");

	}

}
