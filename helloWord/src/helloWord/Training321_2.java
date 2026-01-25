package helloWord;

import java.util.Scanner;

import beans.Employee;

public class Training321_2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("＜社員情報入力＞");
		System.out.print("社員ID＞");
		String id = sc.next();
		emp.setId(id);
		System.out.print("氏名　＞");
		String name = sc.next();
		emp.setName(name);
		System.out.print("年齢　＞");
		int age = sc.nextInt();
		emp.setAge(age);
		emp.display();

		sc.close();

	}

}
