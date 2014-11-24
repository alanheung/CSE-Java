package corrigan;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ProductData implements Serializable{
	
	private static final long serialVersionUID=1L;
	private double subTotal;
	private double total;
	
	private static List<Product> products = new ArrayList<Product>(Arrays.asList(
			new Product("Milk",1.00,"Dairy",0,10),
			new Product("Bread",1.00,"Bakery",0,10),
			new Product("Sausages",2.00,"Meat",0,2)
			));
	private static List<Product> basket = new ArrayList<Product>();
	
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
			if(product.getInBasket()>1){
				if(basket.contains(product)){
				}
				else{
				}
				product.setTotalLeft(product.getTotalLeft()+1);
				product.setCount(product.getCount()+1);
				product.setInBasket(product.getInBasket()-1);
			}
			else if(product.getInBasket()==1){
				basket.remove(product);
				product.setTotalLeft(product.getTotalLeft()+1);
				product.setCount(product.getCount()+1);
			}
			count--;
		}
		product.setCount(0);
	}
	
	public int getNumberInBasket(){
		int total=0;
		for(Product temp:basket){
			total+=temp.getInBasket();
		}
		return total;
	}
	
	public double getSubTotal() {
		int j = 0;
		subTotal = 0;
		while (basket.size() > j) {
			subTotal += (basket.get(j).getPrice()) * (basket.get(j).getInBasket());
			j++;
		}
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTotal() {
		total = (subTotal * 1.1);
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
