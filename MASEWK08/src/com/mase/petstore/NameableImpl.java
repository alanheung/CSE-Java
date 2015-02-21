package com.mase.petstore;

public class NameableImpl implements Nameable{
	private String name;

	@Override
	public void setName(String s) {
		if(s.length()<20){
			this.name = s;
		}else{
			System.out.println("Name too long");
		}
	}

	@Override
	public String getName() {
		return this.name;
	}
	
}
