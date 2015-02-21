package com.mase.animals;

public class Owner {
	private String name;
	private String setName;

	public Owner(String s){
		this.name=s;
		System.out.println("Owner::owner");
	}
	public String getName(){
		System.out.println("Owner::getName");
		return this.getName();
	}
	public void setName(String setName){
		this.setName = setName;
		System.out.println("Owner::setName");
	}
}
