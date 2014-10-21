
public class Bank {
	public static void main(String[] args) {
		//joe
		Customer joe = new Customer();
		joe.setName("Joe");
		joe.setAccountNo(555789);
		joe.setBalance(5000.00);
		System.out.println(joe.getName() +"'s account is "+ joe.getAccountNo());
		System.out.println(joe.getName() +"'s balance is "+ joe.getBalance());
		//alan
		Customer alan = new Customer("Alan", 555991, 20000.00);
		System.out.println(alan);
		//david
		Customer david = new Customer("David", 555378, 90000.00);
		System.out.println(david);
		System.out.println("The count is "+Customer.getCount());


	}
}
