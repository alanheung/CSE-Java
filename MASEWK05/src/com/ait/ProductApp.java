package com.ait;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		//Display a welcome message
		System.out.println("Welcome to the Product Selector");
		System.out.println();

		//Perform 1 or more selections
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			System.out.println("Please enter product code");
			String productCode = sc.next();//read the prod code
			sc.nextLine();//discard any other data entered
			
			// get the product object
			Product p = ProductDB.getProduct(productCode);
			
			//display the output
			System.out.println();
			if(p != null){
				System.out.println(p);
			}else{
				System.out.println("No product mathes this product code.\n");
			}
			System.out.println("Product count: "+ Product.getCount() + "\n");
			
			//see if the suer wants to continue
			System.out.println("Continue (y/n)");
			choice = sc.nextLine();
			System.out.println();
			
		}
	}

}//
