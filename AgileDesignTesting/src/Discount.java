
import java.util.*;

public class Discount {

	private static final float DISCOUNT_RATE = 10;

	public static void main(String[] args) {
		float orderPrice, discount, discountPrice;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Cost of Order:");
		orderPrice = in.nextFloat();
		if (orderPrice >= 50) {
			discount = (orderPrice * DISCOUNT_RATE / 100);
		} else {
			discount = 0;
		}
		discountPrice = (orderPrice - discount);
		System.out.println("Discount Rate:" + discount + "\n"
				+ "Discounted Price:" + discountPrice + "\n");
		in.close();
	}
}