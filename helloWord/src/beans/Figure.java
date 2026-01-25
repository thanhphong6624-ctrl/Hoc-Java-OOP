package beans;

public class Figure {
	protected int length;

	public Figure(int length) {
		this.length = length;
	}

	public void dispFigure() {
		System.out.println("＜円＞");
		System.out.println("半径：" + length);
	}
}
