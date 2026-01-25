package beans;

public class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void display() {
		System.out.println("氏名　：" + name);
		System.out.println("年齢　：" + age + "歳");
	}
}
