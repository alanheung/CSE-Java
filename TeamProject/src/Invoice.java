import java.util.Scanner;

class Invoice{
	String basket;
	String delivery;
	int itemPrice;
	double pricePerItem;

	Invoice(){
		basket = "";
		delivery = "";
		itemPrice = 0;
		pricePerItem = 0.0;
	}

	String getbasket(){
		return basket;
	}
	String getdelivery(){
		return delivery;
	}
	int getItemPrice(){
		return itemPrice;
	}
	double getPricePerItem(){
		return pricePerItem;
	}
	double getInvoiceAmount(){
		return (itemPrice * pricePerItem);
	}
	void setbasket(String bsk){
		basket = bsk;
	}
	void setdelivery(String del){
		delivery = del;
	}
	void setItemPrice(int ip){
		itemPrice = ip;
	}
	void setPricePerItem(double ppi){
		pricePerItem = ppi;
	}

}
class InvoiceDemo {
	
	public static void main(String args[]) {
		Invoice invoice = new Invoice();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter basket total :");
		invoice.setbasket(sc.nextLine());
		System.out.print("Enter delivery charges :");
		invoice.setdelivery(sc.nextLine());
		System.out.print("Enter item price :");
		invoice.setItemPrice(sc.nextInt());
		System.out.print("Enter price per item :");
		invoice.setPricePerItem(sc.nextDouble());

		System.out.print("\n\nInvoice:");
		System.out.print("\nBasket total :" + invoice.getbasket());
		System.out.print("\nPart description :" + invoice.getdelivery());
		System.out.print("\nTotal Billing Amount :" + invoice.getInvoiceAmount());
	}
}
