package hoidanit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class testp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			numbers.add(i + 1);

		}
		int n1 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			String command = sc.next();

			if (command.equals("resize")) {
				int sz = sc.nextInt();
				int currentSize = numbers.size();

				if (sz < currentSize) {
					for (int j = currentSize - 1; j >= sz; j--) {
						numbers.remove(j);
					}
				}
			} else if (command.equals("reverse")) {
				Collections.reverse(numbers);
			} else if (command.equals("swap")) {
				int index1 = sc.nextInt() - 1;
				int index2 = sc.nextInt() - 1;
				if (index1 < numbers.size() && index2 < numbers.size()) {
					Collections.swap(numbers, index1, index2);
				}
			}
		}
		for (int num : numbers)
			System.out.println(num);
		sc.close();
	}

}
