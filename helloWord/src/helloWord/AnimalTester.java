package helloWord;

class AnimalTester {

	public static void main(String[] args) {
//		ンスタンス名：cat
//
//		　　種類　：猫
//
//		　　名前　：タマ
//
//		　　鳴き声：にゃーにゃー
//
//		　　年齢　：5
		Animal cat = new Animal();
		cat.kind = "猫";
		cat.name = "タマ";
		cat.cry = "にゃーにゃー";
		cat.age = 5;
//		インスタンス名：dog
//
//		　　種類　：犬
//
//		　　名前　：ポチ
//
//		　　鳴き声：ワンワン
//
//		　　年齢　：3
		Animal dog = new Animal();
		dog.kind = "犬";
		dog.name = "ポチ";
		dog.cry = "ワンワン";
		dog.age = 3;

		dog.show();
		cat.show();

//		初期値なしの Animal インスタンスを生成します。
//
//		　　インスタンス名：dog2
		Animal dog2 = new Animal("犬", "meomeo", "ガウガウ", 4);
		dog2.show();

	}

}
