package helloWord;

public class Student {
	String name;
	double score;

	Student(String name, double score) {
		this.name = name;
		this.score = score;

	}

	@Override
	public String toString() {
		return name + "(" + score + ")";

	}
}
