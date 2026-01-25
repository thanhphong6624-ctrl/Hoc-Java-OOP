package beans;

public class Automobile {
	protected int gasoline;
	private int distance;

	public Automobile(int gasoline) {
		this.gasoline = gasoline;
		distance = 1000;

	}

	public void run() {
		if (gasoline > 0) {
			gasoline -= 25;
			distance += 250;

		} else {
			System.out.println("【停止】");
		}
	}

	public void dispAutomobile() {
		System.out.println("ガソリン：" + gasoline + "cc");
		System.out.println("走行距離：" + distance + "m");
	}

}
