package ait.com.tables;

import java.io.Serializable;

public class Name implements Serializable{
	
	private static final long serialVersinoUID = 1L;
	private String first;
	private String last;
	public Name(String first, String last){
		this.first=first;
		this.last=last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
}
