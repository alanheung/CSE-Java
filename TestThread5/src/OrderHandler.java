
public class OrderHandler extends Thread{
	private OrderQueue orderQueue;

	public OrderHandler(OrderQueue orderQueue){
		this.orderQueue = orderQueue;
	}
	@Override
	public void run(){
		Order order;
		while (true){
			order = orderQueue.pullOrder();// get the next available order
			System.out.println("                                                                         "+
			order.toString()+"processed by "+this.getName());
			try{
				Thread.sleep(2000);// delay of two secs
			}catch(InterruptedException e){
				//ignore interruptions
			} 
		}
	}
}
