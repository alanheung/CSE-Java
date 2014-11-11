import java.util.Scanner;

public class MobilePhones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String network = getNetwork();
		if(network.equalsIgnoreCase("Vodafone")){
			String plan = getPlan(network);
			boolean billPay = getBillPay();

			String continueOn="y";
			while(continueOn.equalsIgnoreCase("y")){
				String phoneChoice = getPhoneChoice();
				if(phoneChoice.equalsIgnoreCase("iphone")){
					int gigabytes = getGigabytes();
					String model = getModel(phoneChoice);
					if(model.equalsIgnoreCase("5")){
						if(billPay){
							IPhone iphone = new IPhone(model, network, plan, billPay, gigabytes);
							System.out.print(iphone);
							System.out.print("\nIPhone 5 purchase price is "+iphone.getPurchasePrice()
									+" \nthe rental cost is "+ iphone.getRentalPerMonth());
						}else{
							System.out.print("\niPhone 5's are available to bill paying customers only ");
						}
					}else{
						System.out.print("\niPhone 4/4s logic yet to be implemented");
					}
					}else if(phoneChoice.equalsIgnoreCase("Samsung")){
						Samsung samsung = new Samsung();
						String theModel = getModel(phoneChoice);
						samsung.setModel(theModel);
						samsung.setNetwork(network);
						samsung.setPlan(plan);
						samsung.setbillPay(billPay);
						System.out.print(samsung);
					}else{
						System.out.print("You have entered an unknown phone ");
					}
					System.out.print("\nCreate another phone (y/n): ");
					continueOn = sc.next();
				}
				System.out.println(IPhone.getCount()+ " iPhone count");
				System.out.println(Samsung.getCount()+ " Samsung count");
		}else if(network.equalsIgnoreCase("O2")){
			System.out.println("O2 logic yet to be implemented");
		}else{
			System.out.println("Unknown network");
		}
	}//
	public static String getPhoneChoice(){
		System.out.print("Please enter phone choice(Samsung/IPhone): ");
		String phoneChoice = sc.next();
		return phoneChoice;
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
	public static String getNetwork(){
		System.out.print("Please enter network(Vodafone/O2): ");
		return sc.nextLine();
	}
	public static String getPlan(String network){
		String plan="";
		if(network.equalsIgnoreCase("Vodafone")){
			System.out.print("Enter the plan: Plus/Complete/CompletePlus? ");
			plan = sc.next();
		}
		return plan;
	}
	public static int getGigabytes(){
		System.out.print("Please enter gigabytes (16/32/64): ");
		return sc.nextInt();
	}
	public static boolean getBillPay(){
		System.out.print("Enter bill pay: true/false? ");
		boolean billPay = sc.nextBoolean();
		return billPay;
	}

}//
