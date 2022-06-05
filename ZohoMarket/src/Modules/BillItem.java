package Modules;

public class BillItem {
	String itemId;
	float price;
	int quantity;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BillItem [itemId=" + itemId + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
