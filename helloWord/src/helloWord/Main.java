package helloWord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("nhap so luong hoc sinh");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("nhap ten va diem " + (i + 1) + " :");
			String name = sc.next();
			double score = sc.nextDouble();
			students.add(new Student(name, score));

		}
		List<Student> topStudents = students.stream().filter(s -> s.score >= 8)
				.sorted(Comparator.comparingDouble((Student s) -> s.score).reversed()).collect(Collectors.toList());

		System.out.println(topStudents);

		sc.close();
	}

}
