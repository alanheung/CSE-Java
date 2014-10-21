public class Customer{
	private String name;
	private int accountNo;
	private double balance;
	private static int count;
	
	public Customer(){
		name = "";
		accountNo = 0;
		balance = 0.0;
		count++;
	}
	public Customer(String name, int accountNo, double balance){
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getCount() {//static method allows public access
		return Customer.count;// must use className.methodName
	}
	@Override
	public String toString(){
		return 	"The name is "+ getName() + ", the account number is "+ getAccountNo()
				+", the balance is "+getBalance();
	}

}
