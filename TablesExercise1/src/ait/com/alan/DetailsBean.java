package ait.com.alan;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="details")
@SessionScoped
public class DetailsBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static final Details[] detailsList = new Details[] {

		new Details("John", "Marketing", 30, new BigDecimal("2000.00")),
		new Details("Robert", "Marketing", 35, new BigDecimal("3000.00")),
		new Details("Mark", "Sales", 25, new BigDecimal("2500.00"))

	};

	public Details[] getDetailsList() {
		return detailsList;
	}

	public static class Details{
		String name;
		String dept;
		int age;
		BigDecimal sal;

		public Details(String name, String dept, int age, BigDecimal sal) {
			this.name = name;
			this.dept = dept;
			this.age = age;
			this.sal = sal;
		}

		public String getname() {
			return name;
		}
		public void setname(String name) {
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
	}
}