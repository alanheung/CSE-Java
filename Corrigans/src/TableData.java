import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class TableData implements Serializable{
	
	private static final long serialVersionUID=1;
	private static List<Product> products = new ArrayList<Product>(Arrays.asList(
			new Product("Milk",1.00,"Dairy",0,10),
			new Product("Bread",1.00,"Bakery",0,10),
			new Product("Sausages",2.00,"Meat",0,2)
			));
	private static List<Product> basket = new ArrayList<Product>();
	
	//Changed
	private double subTotal =100;
	private double total=110;
	
	public List<Product> getProducts(){
		return products;
	}
	
	public List<Product> getBasket(){
		return basket;
	}
	
	public void addToBasket(Product product, int count){
		while(count>0){
			if(product.getTotalLeft()>0){
				if(basket.contains(product)){
				}
				else{
					basket.add(product);
				}
				product.setTotalLeft(product.getTotalLeft()-1);
				product.setCount(product.getCount()-1);
				product.setInBasket(product.getInBasket()+1);
			}
			count--;
		}
		product.setCount(0);
	}
	
	public void removeFromBasket(Product product, int count){
		while(count>0){
			if(product.getInBasket()>=1){
				if(basket.contains(product)){
				}
				else{
					basket.add(product);
				}
				product.setTotalLeft(product.getTotalLeft()+1);
				product.setCount(product.getCount()+1);
				product.setInBasket(product.getInBasket()-1);
			}
			else{
				basket.remove(product);
			}
			count--;
		}
		product.setCount(0);
	}

	//Changed
	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
