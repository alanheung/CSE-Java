import java.util.Scanner;
import java.util.Date;

public class Biscuit {
	private int theNumberOfBiscuits;
	private int theWeight;
	private String theBrand;
	private String theMaker;
	private Date bestBeforeDate;
	
	public boolean isOutOFDate(Date today){
		return today.after(bestBeforeDate);
	}
	public void bestBeforeDate(Date bestBeforeDate){
		this.bestBeforeDate = bestBeforeDate;
	}
	public Date getBestBeforeDate(){
		return bestBeforeDate;
	}
	public Biscuit(){
		theNumberOfBiscuits=0;
		theWeight=0;
		theBrand="";
		theMaker="";
	}
	public Biscuit(String theBrand, String theMaker, int theNumberOfBiscuits, int theWeight, Date bestBeforeDate){
		this.theNumberOfBiscuits = theNumberOfBiscuits;
		this.theWeight = theWeight;
		this.theBrand = theBrand;
		this.theMaker = theMaker;
		this.bestBeforeDate = bestBeforeDate;
	}
	
	public int getTheNumberOfBiscuits() {
		return theNumberOfBiscuits;
	}
	public void setTheNumberOfBiscuits(int theNumberOfBiscuits) {
		this.theNumberOfBiscuits = theNumberOfBiscuits;
	}
	public int getTheWeight() {
		return theWeight;
	}
	public void setTheWeight(int theWeight) {
		this.theWeight = theWeight;
	}
	public String getTheBrand() {
		return theBrand;
	}
	public void setTheBrand(String theBrand) {
		this.theBrand = theBrand;
	}
	public String getTheMaker() {
		return theMaker;
	}
	public void setTheMaker(String theMaker) {
		this.theMaker = theMaker;
	}
	@Override
	public String toString(){
		return 	"The brand is "+ getTheBrand() + ", the maker is "+ getTheMaker()
				+", the number of biscuits is "+getTheNumberOfBiscuits()+", the weight is "+getTheWeight()+"g, the best date is "+ bestBeforeDate;
	}
}
