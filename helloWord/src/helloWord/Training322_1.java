package helloWord;

import java.util.Scanner;

import beans.Circle;

public class Training322_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("半径＞");
		int radius = sc.nextInt();
		Circle figure = new Circle(radius);
		double area = figure.calcArea();
		figure.dispFigure();
		System.out.println("面積：" + area + "平方cm");

		sc.close();
	}

}
