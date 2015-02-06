
public class Order {
	private int number;
	private String name;
	private String address;

	public Order(int number, String name, String address) {
		this.number = number;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString(){
		return "Order no. =" + number +
				", Customer name = " + name +
				", Customer address = "+ address +", ";
	}
}
