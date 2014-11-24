 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class SelectBooleanCheckboxBean {
 
	    private boolean trainee;
	 
	    public SelectBooleanCheckboxBean(){
	 
	    }
	 
	    public String register(){
	        return "register";
	    }
	 
	    public boolean isTrainee() {
	        return trainee;
	    }
	 
	    public void setTrainee(boolean trainee) {
	        this.trainee = trainee;
	    }
	}
