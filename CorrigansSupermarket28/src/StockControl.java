import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="stockcontrol")
@SessionScoped
public class StockControl implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String stockRemove;
	private String category;
	private double price;
	private int count;
	private int totalLeft;
	private String specialOffer;
	Boolean onSpecialOffer = Boolean.valueOf(specialOffer);
	private static List<Product> products = ProductData.getAllProducts();

	public StockControl() {
		
	}
	
	public StockControl(String name,double price,String category,int count,int totalLeft, boolean onSpecialOffer) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.count = count;
		this.totalLeft = totalLeft;
		this.onSpecialOffer = onSpecialOffer;
	}
	
	public String addStock(){
		Product newProduct = new Product(this.name,this.price,this.category,this.count,this.totalLeft, this.onSpecialOffer);
		products.add(newProduct);
		name="";
		price=0;
		count = 0;
		onSpecialOffer=false;
		totalLeft++;
		return "stockpage?faces-redirect=true";
	}
	
	public String removeStock(String stockRemove){
		System.out.println("test");
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equalsIgnoreCase(stockRemove)) {
				products.remove(i);
			}
		}
		return "stockpage?faces-redirect=true";
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

	public void setTotalLeft(int totalLeft) {
		this.totalLeft = totalLeft;
	}

	public static List<Product> getProducts() {
		return products;
	}

	public static void setProducts(List<Product> products) {
		StockControl.products = products;
	}

	public String getStockRemove() {
		return stockRemove;
	}

	public void setStockRemove(String stockRemove) {
		this.stockRemove = stockRemove;
	}

	public String getSpecialOffer() {
		return specialOffer;
	}

	public void setSpecialOffer(String specialOffer) {
		this.specialOffer = specialOffer;
	}

	public Boolean getOnSpecialOffer() {
		return onSpecialOffer;
	}

	public void setOnSpecialOffer(Boolean onSpecialOffer) {
		this.onSpecialOffer = onSpecialOffer;
	}
	
}