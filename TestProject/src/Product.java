import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

public class Product implements Serializable{

	

	@Override
	public String toString() {
		return "Product : " + name +" price : "+ price + " Category : "+category;
	}

	private static final long serialVersionUID = 1L;
	private String name;
	private String category;
	private double price;
	private int count;
	private int totalLeft;
	private int inBasket;
	private boolean search=true;
	boolean canEdit;
	private String image;
	private boolean onSpecialOffer;
	
	public Product(String name, double price, String category,int count,int totalLeft, String image, boolean onSpecialOffer) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.category=category;
		this.price=price;
		this.count=count;
		this.image=image;
		this.totalLeft=totalLeft;
		this.inBasket=0;
		this.onSpecialOffer = onSpecialOffer;
	}
	
	public boolean isOnSpecialOffer() {
		return onSpecialOffer;
	}

	public void setOnSpecialOffer(boolean onSpecialOffer) {
		this.onSpecialOffer = onSpecialOffer;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public boolean isSearch() {
		return search;
	}

	public void setSearch(boolean search) {
		this.search = search;
	}
	
	
	
}
