package helloWord;

class Animal {
	String kind;
	String name;
	String cry;
	int age;

	Animal() {

	}

	Animal(String kind, String name, String cry, int age) {
		this.kind = kind;
		this.name = name;
		this.cry = cry;
		this.age = age;
	}

	void setKind(String kind) {
		this.kind = kind;
	}

	void setName(String name) {
		this.name = name;
	}

	void setCry(String cry) {
		this.cry = cry;
	}

	void setAge(int age) {
		this.age = age;
	}

	void show() {
		System.out.println(this.name + "は" + this.kind + "で、年齢は" + this.age + "歳、鳴き声は" + this.cry);
	}
//	③ 空のコンストラクタを作成しましょう。
//	④ すべてのフィールドを初期化するコンストラクタを追加しましょう。
//	⑤ 次のメソッドを作成してください。
//	　・setKind(String kind)：フィールドkindに代入
//	　・setName(String name)：フィールドnameに代入
//	　・setCry(String cry)：フィールドcryに代入
//	　・setAge(int age)：フィールドageに代入
//	　・show()：
//	　　「〇〇は△△で、年齢は××歳、鳴き声は□□」と表示する
}
