
public class OrderTaker extends Thread{
	private static int orderNumber = 1;
	private static String orderName = "John";
	private static String orderAddress = "Athlone";

	private int count = 0;
	private int maxOrders;
	private OrderQueue orderQueue;

	public OrderTaker (int orderCount, OrderQueue orderQueue){
		this.maxOrders = orderCount; // no of orders to create
		this.orderQueue = orderQueue;// order queue
	}

	@Override
	public void run(){
		Order order;
		while(count < maxOrders){
			order = new Order(getOrderNumber(),getOrderName(), getOrderAddress());
			orderQueue.pushOrder(order);//add order to the queue
			System.out.println(order.toString()+ "created by "+this.getName());
			count++;
			try{
				Thread.sleep(1000);// delay one second
			}catch(InterruptedException e){
				//ignore interruptions
			}
		}
	}

	private String getOrderAddress(){
		return orderAddress;
	}

	private String getOrderName(){
		return orderName;
	}

	private static synchronized int getOrderNumber(){
		return orderNumber++;
	}

}
