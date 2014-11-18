
public class GenerateInvoice {
	//	public GenerateInvoice(double basket, double delivery, Customer customer){
	//		
	//	}
	//	
	//	Customer customer(){
	//		String name="";
	//		String address="";
	//		int cardNumber=0;
	//	}

	private double subtotal;
	private double discountPercent;
	private double discountAmount;
	private int cardNumber=0;
	private double total;

	public GenerateInvoice(){
		subtotal = 0;
		discountPercent = 0;
		discountAmount = 0;
		total = 0;
	}

	public GenerateInvoice(double basket, double delivery, Customer cusmtomer){
		this.basket = basket;
		this.delivery = delivery;
		this.customer = customer;
	}

	public void setsubtotal(double subtotal){
		this.subtotal = subtotal;
	}

	public double getsubtotal(){
		return subtotal;
	}

	private void setDiscountPercent(double DiscountPercent){
		this.discountPercent = DiscountPercent;

	}

	public double DiscountPercent(){
		return discountPercent;    
	}


	private void setDiscountAmount(double DiscountAmount){
		this.discountAmount = DiscountAmount;

	}

	public double DiscountAmount(){
		return discountAmount;     
	}  	     


	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	private void setTotal(double Total){
		this.total = total;

	} 
	public double Total(){
		return total;
	}

	//Function To Generate AlphaNumeric Random Strings that will be used as unique Invoice ID.
	public String invoiceIDGenerator(){
		long decimalNumber=System.nanoTime();
		String strBaseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String invoiceID = "";
		int mod = 0;
		while(decimalNumber!= 0){
			mod=(int) (decimalNumber % 36);
			invoiceID=strBaseDigits.substring(mod,mod+1)+invoiceID;
			decimalNumber=decimalNumber/36;
		}
		return invoiceID;
	}

}//

