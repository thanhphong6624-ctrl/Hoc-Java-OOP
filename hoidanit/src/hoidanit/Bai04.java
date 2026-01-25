package hoidanit;

import java.util.Scanner;

class Bai04 {

	public static void bai01() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();

		System.out.printf("giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.5f  ", x);
		}
		scanner.close();
	}

	public static void bai02() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
	}

	public static void bai03() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính tiền điện");
		System.out.print("Nhập vào số điện: ");
		int a = scanner.nextInt();
		if (a <= 100) {
			int money = a * 1000;
			System.out.println("Số tiền điên: " + money);
		} else if (a > 100) {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Số tiền điên: " + money);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.print("Lựa chọn của bạn: ");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
//		Giải phương trình bậc nhất
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.out.println(">> Bạn đã thoát chương trình <<");
			System.exit(0);

		}
		scanner.close();
	}
}
