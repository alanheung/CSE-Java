package com.mase.oop1.code2;

public enum FarmerType {
	DAIRY,
	BEEF,
	SHEEP;

	private int numAcres = 500;

	public int getNumAcres() {
		return numAcres;
	}

	@Override
	public String toString(){
		String s = "";
		if(this.ordinal()==0){
			s = "Dairy Farmer and has "+numAcres+" acres";
		}else if(this.ordinal()==1){
			s = "Beef Farmer and has "+numAcres+" acres";
		}else if(this.ordinal()==2){
			s = "Sheep Farmer and has "+numAcres+" acres";
		}
		return s;
	}
}
