package helloWord;

import java.util.Scanner;

import beans.DigitalVending;

class Training321_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("＜デジタル自動販売機・設定＞");
		DigitalVending vending = new DigitalVending();
		System.out.print("商品名＞");
		String itemName = sc.next();
		vending.setItemName(itemName);
		System.out.print("価格＞");
		int itemPrice = sc.nextInt();
		vending.setItemPrice(itemPrice);
		System.out.print("天気＞");
		String weather = sc.next();
		vending.setWeather(weather);
		System.out.print("気温＞");
		String temperature = sc.next();
		vending.setTemperature(temperature);
		System.out.println("＜設定値・確認＞");
		vending.dispVending();

		sc.close();
	}

}
