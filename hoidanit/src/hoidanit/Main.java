package hoidanit;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee katsuo = new Employee();
		katsuo.id = 15001;
		katsuo.name = "磯野　かつお";
		katsuo.division = "営業部";
		katsuo.salary = 100000;
		katsuo.information();

		Employee hanako = new Employee();
		hanako.setAll(15004, "花沢　はな子", "総務部", 200000);

		Employee ikura = new Employee();
		ikura.setAll(15005, "波野　いくら", "営業部", 500000);

		Employee wakame = new Employee();
		wakame.setAll(15002, "磯野　わかめ", "総務部", 200000);

		Employee tarao = new Employee();
		tarao.setAll(15003, "フグ田　たらお", "営業部", 300000);

		hanako.information();
		ikura.information();
		wakame.information();
		tarao.information();

		Employee[] employees = { katsuo, hanako, ikura, wakame, tarao };
		katsuo.countDivision(employees);
	}

}
