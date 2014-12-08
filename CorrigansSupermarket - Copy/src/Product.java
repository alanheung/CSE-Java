import java.io.Serializable;


public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String category;
	private double price;
	private int count;
	private int totalLeft;
	private int inBasket;
	boolean canEdit;
	
	public Product(String name, double price, String category,int count,int totalLeft) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.category=category;
		this.price=price;
		this.count=count;
		this.totalLeft=totalLeft;
		this.inBasket=0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTotalLeft() {
		return totalLeft;
	}
	
	public void setInBasket(int inBasket) {
		this.inBasket = inBasket;
	}
	
	public int getInBasket() {
		return inBasket;
	}

	public void setTotalLeft(int totalLeft) {
		this.totalLeft = totalLeft;
	}

	public boolean isCanEdit(){
		return canEdit;
	}
	
	public void setCanEdit(boolean canEdit){
		this.canEdit=canEdit;
	}
	
}
