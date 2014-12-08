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
	private String searchQuery;
	private static List<Product> products = new ArrayList<Product>(Arrays.asList(
			new Product("Milk",1.00,"Dairy",0,10, "images/milk.jpg", false),
			new Product("Bread",1.00,"Bakery",0,10, "images/bread.jpg", false),
			new Product("Sausages",2.00,"Meat",0,2, "images/sausages.jpg", false)
			));
	private static List<Product> basket = new ArrayList<Product>();
	private static List<Product> resultsOfSearch = new ArrayList<Product>();

	List<UserDetails> userDetails = new ArrayList<UserDetails>();
	
	private String Add;
	private String No;
	
	public List<Product> getProducts(){
		return products;
	}
	
	public static List<Product> getAllProducts(){
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

	public String getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
	
	public static List<Product> getResultsOfSearch() {
		return resultsOfSearch;
	}

	public static void setSearchResults(List<Product> searchResults) {
		ProductData.resultsOfSearch = searchResults;
	}

	public void conductSearch(){
		for(Product currentProduct : products){
			if(currentProduct.getName().equalsIgnoreCase(this.searchQuery) || 
					currentProduct.getCategory().equalsIgnoreCase(this.searchQuery)){
				currentProduct.setSearch(true);
			}
			else{
				currentProduct.setSearch(false);
			}
		}
	}
	
	public void reset(){
		for(Product currentProduct : products){
			currentProduct.setSearch(true);
		}
	}
	
	 
	public String isBasketEmpty(){
		if(basket.size()==0){
			return "basket?faces-redirect=true";
		}
		else{
			return "delivery?faces-redirect=true";
		}
		
	}

	public String getAdd() {
		return Add;
	}

	public void setAdd(String add) {
		Add = add;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}
	
	public String saveUserDetails(String time, String fullName, String notes) {
		//System.out.println(time + " " + total + " " + fullName);
		addCustomer(time, total, fullName, notes);
		return "deliverysuccess";
	}
	
	public void addCustomer(String time, double total2, String fullName, String notes) {
		String address = null; String mobileNo = null;
		int x = UserData.getAllUsers().size();
		System.out.println(x);
		for (int y = 0 ; y < x ; y++) {
			if (fullName.equalsIgnoreCase(UserData.getAllUsers().get(y).getFullName())) {
				address = UserData.getAllUsers().get(y).getAddress();
				mobileNo = UserData.getAllUsers().get(y).getMobileNumber();
			}
			
		}
		UserDetails p = new UserDetails(fullName,basket.toString(),notes,address,time, mobileNo);
		userDetails.add(p);
		for (UserDetails i : userDetails) {
			System.out.println(i.toString());
		}
	}
	
}