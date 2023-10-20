package main;

public class Item {
	private String nameItem;
	private int price;
	private int stock;
	private String description;
	
	public Item(String nameItem, int price, int stock, String description) {
		super();
		this.nameItem = nameItem;
		this.price = price;
		this.stock = stock;
		this.description = description;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
