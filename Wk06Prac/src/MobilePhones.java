import java.util.Scanner;

class Samsung {
	private String model, network, plan;
	private boolean billPay;
	private static int count;

	public Samsung(){
		count++;
	}

	public static int getCount(){
		return count;
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

	public boolean isBillPay() {
		return billPay;
	}

	public void setBillPay(boolean billPay) {
		this.billPay = billPay;
	}

	@Override
	public String toString() {
		return "Samsung [model=" + model + ", network=" + network + ", plan="
				+ plan + ", billPay=" + billPay + "]";
	}
}

class IPhone{
	private String model, network, plan;
	private double purchasePrice;
	private boolean billPay;
	private int gigabytes, rentalPerMonth;
	private static int count;

	public IPhone(){
		count++;
	}

	public IPhone(String model, String network, String plan,
			boolean billPay, int gigabytes) {
		this.model = model;
		this.network = network;
		this.plan = plan;
		this.billPay = billPay;
		this.gigabytes = gigabytes;
		if(this.billPay)
			billpayPriceAndRental();
		count++;
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

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "IPhone [model=" + model + ", network=" + network + ", plan="
				+ plan + ", purchasePrice=" + purchasePrice + ", billPay="
				+ billPay + ", gigabytes=" + gigabytes + ", rentalPerMonth="
				+ rentalPerMonth + "]";
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
}

public class MobilePhones{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String []args){
		String network = getNetwork();
		if(network.equalsIgnoreCase("Vodafone")){
			String plan = getPlan(network);
			boolean billPay = getBillPay();

			String continueOn="y";
			while(continueOn.equalsIgnoreCase("y")){
				String phoneChoice = getPhoneChoice();
				if(phoneChoice.equalsIgnoreCase("iPhone")){
					int gigabytes = getGigabytes();
					String model = getModel(phoneChoice);
					if(model.equalsIgnoreCase("5")){
						if(billPay){
							IPhone iphone = 
									new IPhone(model, network, plan, billPay, gigabytes);
							System.out.println(iphone);
							System.out.println("iPhone 5: purchase price is "+iphone.getPurchasePrice()+
									"; the rental cost is "+iphone.getRentalPerMonth());
						}else{
							System.out.println("iPhone 5's are available to bill pay customers only...");
						}
					}else{
						System.out.println("4/4S logic has yet to be implemented...");
					}
				}else if (phoneChoice.equalsIgnoreCase("Samsung")){
					Samsung samsung = new Samsung();
					String model = getModel(phoneChoice);
					samsung.setModel(model);
					samsung.setNetwork(network);
					samsung.setPlan(plan);
					samsung.setBillPay(billPay);
					System.out.println(samsung);

				}else{
					System.out.println("Unknown phone");
				}

				// do we wish to create another phone
				System.out.print("Create another phone (y/n): ");
				continueOn = sc.next();
			}
			System.out.println(IPhone.getCount()+ " iPhones created.");
			System.out.println(Samsung.getCount()+ " Samsungs created.");
		}else if(network.equalsIgnoreCase("O2")){
			System.out.println("O2 logic yet to be implemented...");
		}else{
			System.out.println("Unknown network...");
		}

	}
	public static String getPhoneChoice(){
		System.out.print("Enter a phone: iPhone or Samsung? ");
		String phoneChoice = sc.next();
		return phoneChoice;
	}
	public static boolean getBillPay(){
		System.out.print("Enter bill pay: true/false? ");
		boolean billPay = sc.nextBoolean();
		return billPay;
	}
	public static String getNetwork(){
		System.out.print("Enter a network: Vodafone or O2? ");
		String network = sc.next();
		return network;
	}
	public static int getGigabytes(){
		System.out.print("How many gigabytes: 16/32/64? ");		
		return sc.nextInt();
	}
	public static String getPlan(String network){
		String plan="";
		if(network.equalsIgnoreCase("Vodafone")){
			System.out.print("Enter the plan: Plus/Complete/CompletePlus? ");
			plan = sc.next();
		}
		return plan;
	}
	public static String getModel(String phoneChoice){
		String model="";
		if(phoneChoice.equalsIgnoreCase("iPhone")){
			System.out.print("Choose a model: 5/4/4S? ");
			model = sc.next();
		}else if(phoneChoice.equalsIgnoreCase("Samsung")){
			System.out.print("Choose a model: One/Desire/Wildfire? ");
			model = sc.next();
		}

		return model;
	}
}