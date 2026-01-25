package helloWord;

import java.util.Scanner;

class Practice241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("メールアドレス＞");
		String mail1 = sc.next();

		System.out.print("パスワード　　＞");
		String pass1 = sc.next();

		Login log = new Login(mail1, pass1);
		String mail2 = log.getMail();
		String pass2 = log.getPass();

		System.out.println("メールアドレス：" + mail2);
		System.out.print("パスワード　　：" + pass2);

		sc.close();
	}

}
