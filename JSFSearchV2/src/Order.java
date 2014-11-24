import java.util.ArrayList;
import java.util.Arrays;

public class Order{

	String thingNo;
	String thingName;
	String thingInfo;
	String ID;

	public Order(String thingNo, String thingName, String thingInfo) {
		this.thingNo = thingNo;
		this.thingName = thingName;
		this.thingInfo = thingInfo;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFirstValue() {
		return null;
	}
	
	public String getThingNo() {return thingNo;}
	public void setThingNo(String thingNo) {this.thingNo = thingNo;}
	public String getThingName() {return thingName;}
	public void setThingName(String thingName) {this.thingName = thingName;}
	public String getThingInfo() {return thingInfo;}
	public void setThingInfo(String thingInfo) {this.thingInfo = thingInfo;}


	private static final ArrayList<Order> orderList = 
		    new ArrayList<Order>(Arrays.asList(
		    new Order("First", "Table", "description here"),
		    new Order("Second", "Chair", "2nd description here"),
		    new Order("Third", "Fridge", "3rd description here"),
		    new Order("Fourth", "Carpet", "4th description here"),
		    new Order("Fifth", "Stuff", "5th description here")
		));
}
