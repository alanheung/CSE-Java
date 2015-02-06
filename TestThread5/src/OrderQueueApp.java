//This is a multi-threaded app that shows the operation of an order queue taking in orders
//The threads are the taker, order and handler.
//Each have to process the order in their own queue or thread
//3 orders are created in which each thread has 3 so a total of nine orders are created
//Each displays the order number, name and address which are hard coded 
//When a thread is finished processing an order it displays it and in the end you can see 
//that the orders are completed eventually
public class OrderQueueApp {
	public static void main(String [] args){
		final int TAKER_COUNT = 3; // no of OrderTaker threads

		final int ORDER_COUNT = 3; //no of orders per orderTaker thread
		final int HANDLER_COUNT = 2; // number of orderHandler threads

		OrderQueue queue = new OrderQueue(); // create the order queue

		System.out.println("Starting the order queue.");

		System.out.println("Starting "+ TAKER_COUNT + " order takers," + 
				" each producing " + ORDER_COUNT +  " orders.");

		System.out.println("Starting " + HANDLER_COUNT + " order handlers.");

		String s = "Ordertaker threads                 OrderHandler Threads";
		System.out.println(s);

		for(int i = 0; i < TAKER_COUNT; i++){// creates the taker threads
			OrderTaker t = new OrderTaker(ORDER_COUNT, queue);
			t.start();
		}
		for(int i = 0; i < HANDLER_COUNT; i++){// creates the handler threads
			OrderHandler h = new OrderHandler(queue);
			h.start();
		}
	}
}
