package beans;

public class Taxi extends Automobile {
	private int meter;

	public Taxi(int gasoline, int meter) {
		super(gasoline);
		this.meter = meter;
	}

	@Override
	public void run() {
		super.run();
		if (gasoline > 0) {
			meter += 80;
		}
	}

	@Override
	public void dispAutomobile() {
		super.dispAutomobile();
		System.out.println("料金　　：" + meter + "円");
	}
}
