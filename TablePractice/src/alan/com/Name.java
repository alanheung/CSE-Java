package alan.com;

import java.io.Serializable;
import java.math.BigDecimal;

public class Name implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String dept;
	private int age;
	BigDecimal sal;
	boolean canEdit;
	
	public Name(String name, String dept, int age, BigDecimal sal){
		this.name=name;
		this.dept=dept;
		this.age=age;
		this.sal=sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public boolean isCanEdit() {
		return canEdit;
	}
	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
	

}

