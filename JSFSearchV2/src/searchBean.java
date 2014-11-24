import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "search")
@SessionScoped
public class searchBean implements Serializable{
	private static final long serialVersionUID = 1L;

	Scanner sc = new Scanner(System.in);

	// create an empty array list with an initial capacity
	ArrayList<String> arrlist = new ArrayList<String>();
	

	// use add() method to add elements in the list
	arrlist.add("Milk");
	arrlist.add("Butter");
	arrlist.add("Cheese");
	
	private String inputWord;

	// let us print all the elements available in list
	for (String element : arrlist) {
		System.out.println("Products = " + element);
	}
	public String userInput(){
		System.out.print("Please enter search criteria: ");
		String input = sc.next();
		return input;
	}
	if (input.equalsIgnoreCase(arrlist.get(0))) {
		System.out.println("Display milk");
	}else if(input.equalsIgnoreCase(arrlist.get(1))){
		System.out.println("Display butter");
	}else if(input.equalsIgnoreCase(arrlist.get(2))){
		System.out.println("Display cheese");
	}else{
		System.out.println("Sorry search criteria is not listed");
	}

	public String searchWord() {
		if (this.username == null || this.username.equals("") ){
			isUsernameValid = false;
		}
		else {
			isUsernameValid = true;
		}
		if (this.password == null  || this.password.equals("")) {
			isPasswordValid = false;
		} 
		else {
			isPasswordValid = true;
		}
		if (this.username.equals("root")&&this.password.equals("admin")){
			isNameAndPasswordCorrect=true;
		}
		else{
			isNameAndPasswordCorrect=false;
		}
		validationComplete = true;
		return "null";
	}

}//


