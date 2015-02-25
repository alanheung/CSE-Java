package com.example.localbirds;

import com.example.hunters.Eagle;

public class Robin {

	private String name;
	private int age;

	Robin(){
		name="Robin";
		age=2;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Robin [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Robin){
			Robin robin = (Robin)o;
			if(getName().equals(robin.getName())){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Eagle eag = new Eagle();
		
		System.out.println(eag);
	}

}
