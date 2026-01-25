package beans;

public class Vending {
	private String itemName;
	private int itemPrice;

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemName() {
		return this.itemName;
	}

	public int getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void dispVending() {
		System.out.println("商品名：" + itemName);
		System.out.println("価格　：" + itemPrice + "円");
	}
}
