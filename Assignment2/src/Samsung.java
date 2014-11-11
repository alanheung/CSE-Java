
public class Samsung {
	private String model;
	private String network;
	private String plan;
	private boolean billPay = false;
	private static int count;

	public Samsung(){
		model="";
		network="";
		plan="";
		count++;
	}
	public Samsung(String model, String network, String plan){
		this.model=model;
		this.network=network;
		this.plan=plan;
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
	public static int getCount(){
		return Samsung.count;
	}

	@Override
	public String toString(){
		return 	"The model is "+ getModel() + ", \nthe network is "+ getNetwork()
				+", \nthe plan is "+getPlan();
	}
	public void setbillPay(boolean billPay) {
		this.billPay=billPay;
	}

}
