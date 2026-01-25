package beans;

public class DigitalVending extends Vending {
	private String weather;
	private String temperature;

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	@Override
	public void dispVending() {
		super.dispVending();
		System.out.println("天気　：" + weather);
		System.out.println("気温　：" + temperature + "°C");
	}
}
