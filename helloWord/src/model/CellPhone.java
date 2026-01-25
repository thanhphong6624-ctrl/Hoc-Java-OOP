package model;

public class CellPhone implements SmartPhone {
	private String address;
	private String url;

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.address = address;
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("メールを送信しました。");
		System.out.println("To ：" + address);
	}

	@Override
	public void setURL(String url) {
		// TODO Auto-generated method stub
		this.url = url;
	}

	@Override
	public void webBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Webページにアクセスしました。");
		System.out.println("URL：" + url);
	}

}
