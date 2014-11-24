

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SpecialOffers {

	private static List<Product> products = new ArrayList<Product>(Arrays.asList(
			new Product("Sausages",2.00,"Meat",0,2, "resources/images/sausages.jpg", true),
			new Product("Milk",1.00,"Dairy",0,10, "resources/images/milk.jpg", false),
			new Product("Bread",1.00,"Bakery",0,10, "resources/images/bread.jpg", true)));


	private static List<Product> specialOfferList = new ArrayList<Product>();

	public static List<Product> getSpecialOfferList() {
		return specialOfferList;
	}

	public static void setSpecialOfferList(List<Product> specialOfferList) {
		SpecialOffers.specialOfferList = specialOfferList;
	}

	public static List<Product> getProducts() {
		return products;
	}

	public static void setProducts(List<Product> products) {
		SpecialOffers.products = products;
	}

	public static void SpecialOffer(List<Product>products){
		for(Product aProduct: products){
			if (aProduct.isSpecialOffer()== true){
				specialOfferList.add( aProduct);
//		//		System.out.println(aProduct);
//				System.out.println();
				

			}
		
		}
		System.out.println(specialOfferList);
	}

	public static void main(String[] args) {
//
//		System.out.print(specialOfferList);
//
//		for(Product aProduct: products){
//			System.out.print(aProduct);
//		}
//	}
	
	SpecialOffer(products);
	}

}

