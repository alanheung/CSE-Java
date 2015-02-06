import java.util.LinkedList;

public class OrderQueue {
	private LinkedList<Order> orderQueue = new LinkedList<>();
	
	public synchronized void pushOrder(Order order){
		orderQueue.addLast(order);
		notifyAll(); //notifies waiting threads
	}
	
	public synchronized Order pullOrder(){
		while(orderQueue.size()==0){// if no orders are in the queue waiting
			try{
				wait();
			}catch(InterruptedException e){
				//ignore interruptions
			}
		}
		return orderQueue.removeFirst();
	}
}
