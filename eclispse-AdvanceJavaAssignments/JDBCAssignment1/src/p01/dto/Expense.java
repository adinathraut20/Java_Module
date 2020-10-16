package p01.dto;

public class Expense {
	private int expenseId;
	private String item;
	private float price;
	private String purchaseDate;
	public Expense(int expenseId, String item, float price, String purchaseDate) {
		
		this.expenseId = expenseId;
		this.item = item;
		this.price = price;
		this.purchaseDate = purchaseDate;
	}
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
}