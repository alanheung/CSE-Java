
public class GenerateInvoice {
//	private double discountPercent;
//	private double discountAmount;
	private int cardNumber=0;
	private double total;

	public GenerateInvoice(){
//		discountPercent = 0;
//		discountAmount = 0;
		total = 0;
	}

	public GenerateInvoice(double basket, double delivery, Customer cusmtomer){
		this.basket = basket;
		this.delivery = delivery;
		this.customer = customer;
	}

//	private void setDiscountPercent(double DiscountPercent){
//		this.discountPercent = DiscountPercent;
//
//	}
//
//	public double DiscountPercent(){
//		return discountPercent;    
//	}
//
//
//	private void setDiscountAmount(double DiscountAmount){
//		this.discountAmount = DiscountAmount;
//
//	}
//
//	public double DiscountAmount(){
//		return discountAmount;     
//	}  	     

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	private void setTotal(double Total){
		this.total = (invoice.getBasket()+invoice.getDelivery);

	} 
	public double Total(){
		return total;
	}
	
	System.out.print("\n\nInvoice:");
	System.out.print("\nCustomer Details :" + invoice.getCustomerDetails);
	System.out.print("\nBasket Total :" + invoice.getBasket());
	System.out.print("\nDelivery :" + invoice.getDelivery());
	System.out.print("\nTotal Billing Amount :" + total );

}//

