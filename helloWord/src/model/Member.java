package model;

public class Member {
	private int no;
	private String name;

	public Member(int no, String name) {
		this.no = no;
		this.name = name;

	}

	public void display() {
		System.out.println("会員番号：" + no);
		System.err.println("会員名：" + name);
	}
}
