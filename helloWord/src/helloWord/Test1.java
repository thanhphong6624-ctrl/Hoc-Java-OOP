package helloWord;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập tên học viên thứ " + (i + 1) + ": ");
			String student = sc.nextLine();
			students.add(student);
		}
		System.out.println("--- danh sach hoc vien ---");
		students.forEach(student -> System.out.println(student));

		System.out.println("--- Danh sách học viên có tên dài (trên 5 ký tự) ---");
		students.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));

		sc.close();
	}

}
