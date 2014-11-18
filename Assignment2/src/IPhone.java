
public class IPhone {
	private String model;
	private String network;
	private String plan;
	private double purchasePrice;
	private boolean billPay;
	private int gigabytes;
	private int rentalPerMonth;
	private static int count;


	public IPhone(){
		model="";
		network="";
		plan="";
		purchasePrice=0.0;
		billPay=false;
		gigabytes=0;
		rentalPerMonth=0;
		count++;
	}
	public IPhone(String model, String network, String plan, boolean billPay, int gigabytes){
		this.model=model;
		this.network=network;
		this.plan=plan;
		this.billPay=billPay;
		this.gigabytes=gigabytes;
		count++;
		if(this.billPay){
			billpayPriceAndRental();
		}
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public boolean isBillPay() {
		return billPay;
	}
	public void setBillPay(boolean billPay) {
		this.billPay = billPay;
	}
	public int getGigabytes() {
		return gigabytes;
	}
	public void setGigabytes(int gigabytes) {
		this.gigabytes = gigabytes;
	}
	public int getRentalPerMonth() {
		return rentalPerMonth;
	}
	public void setRentalPerMonth(int rentalPerMonth) {
		this.rentalPerMonth = rentalPerMonth;
	}
	public static int getCount(){
		return IPhone.count;
	}
	public void billpayPriceAndRental(){
		if( network.equalsIgnoreCase("Vodafone") &&
				model.equalsIgnoreCase("5")	){
			if(plan.equalsIgnoreCase("Plus")){
				switch(getGigabytes()){
				case 16:
					purchasePrice=249;
					rentalPerMonth=30;
					break;
				case 32:
					purchasePrice=299;
					rentalPerMonth=35;
					break;
				case 64:
					purchasePrice=349;
					rentalPerMonth=40;
					break;
				default:
					purchasePrice=-1;
					rentalPerMonth=-1;
					break;
				}
			}else if(plan.equalsIgnoreCase("Complete")){
				switch(gigabytes){
				case 16:
					purchasePrice=129;
					rentalPerMonth=65;
					break;
				case 32:
					purchasePrice=179;
					rentalPerMonth=70;
					break;
				case 64:
					purchasePrice=329;
					rentalPerMonth=75;
					break;
				default:
					purchasePrice=-1;
					rentalPerMonth=-1;
					break;
				}				
			}else if(plan.equalsIgnoreCase("CompletePlus")){
				switch(gigabytes){
				case 16:
					purchasePrice=49;
					rentalPerMonth=75;
					break;
				case 32:
					purchasePrice=99;
					rentalPerMonth=80;
					break;
				case 64:
					purchasePrice=149;
					rentalPerMonth=85;
					break;
				default:
					purchasePrice=-1;
					rentalPerMonth=-1;
					break;
				}
			}
		}
	}
	@Override
	public String toString(){
		return 	"The model is "+ getModel() + " \nthe network is "+ getNetwork()
				+"\nthe plan is "+getPlan()+" \nbillpay: "+isBillPay()+" \ngigabytes: "+getGigabytes();
	}
}//
