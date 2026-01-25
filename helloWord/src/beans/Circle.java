package beans;

public class Circle extends Figure {
	public Circle(int radius) {
		super(radius);
	}

	public double calcArea() {
		double area = length * length * 3.14;
		return area;
	}

	@Override
	public void dispFigure() {
		super.dispFigure();
	}
}
