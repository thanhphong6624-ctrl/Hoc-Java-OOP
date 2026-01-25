package hoidanit;

class Employee {

	int id;
	String name;
	String division;
	int salary;

	void setAll(int id, String name, String division, int salary) {
		this.id = id;
		this.name = name;
		this.division = division;
		this.salary = salary;

	}

	void information() {
		System.out.println("社員番号：" + id);
		System.out.println("氏名　　：" + name);
		System.out.println("所属部署：" + division);
		System.out.println("給料　　：" + salary);
		System.out.println();
	}

	void countDivision(Employee[] employees) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].division.equals("営業部")) {
				a++;
			} else if (employees[i].division.equals("総務部")) {
				b++;
			}
		}
		System.out.println();
		System.out.println("営業部" + a + "人");
		System.out.println("営業部" + b + "人");
	}
}
