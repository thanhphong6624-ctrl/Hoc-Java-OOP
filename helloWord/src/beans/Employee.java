package beans;

public class Employee extends Person {
	private static String company = "株式会社ITS";
	private String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void display() {
		System.out.println("会社名：" + company);
		System.out.println("社員ID：" + id);
		super.display();
	}
}
