package com.money;
public class Money{
	private final int amount;
	private final String currency;

	public Money(int amount, String currency) throws IllegalArgumentException{
		if(amount<1000 && amount>10000 ){ 
			throw new IllegalArgumentException();
		}
		this.amount=amount;
		this.currency=currency;
	}

	public int getAmount(){
		return amount;
	}

	public String getCurrency(){
		return currency;
	}

	public boolean equals(Object anObject){
		if (anObject instanceof Money){
			Money money = (Money) anObject;
			return money.getCurrency().equals(this.currency)&&
					this.amount==money.getAmount();		}
		return false;
	}
}
