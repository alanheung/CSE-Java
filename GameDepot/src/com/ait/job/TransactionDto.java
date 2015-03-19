package com.ait.job;
public class TransactionDto {

	private String targetId;
	private String targetPayPalId;
	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(final double amount) {
		this.amount = amount;
	}

	public String getTargetId() {
		return targetId;
	}

	public String getTargetPayPalId() {
		return targetPayPalId;
	}

	public void setTargetId(final String targetId) {
		this.targetId = targetId;
	}

	public void setTargetPayPalId(final String targetPayPalId) {
		this.targetPayPalId = targetPayPalId;
	}

	

}
