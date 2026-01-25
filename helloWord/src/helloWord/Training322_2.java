package helloWord;

import java.util.Scanner;

import beans.Taxi;

public class Training322_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ガソリン量（cc）＞");
		int gasoline = sc.nextInt();
		System.out.print("初乗り料金（円）＞");
		int meter = sc.nextInt();
		Taxi taxi = new Taxi(gasoline, meter);
		for (int i = 0; i < 5; i++) {
			taxi.run();
			taxi.dispAutomobile();
		}
		sc.close();
	}

}
