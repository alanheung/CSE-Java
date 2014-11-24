import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="deliveryBean")
@SessionScoped
public class deliveryBean implements Serializable{
	private static final long serialVersionUID = 1l;
	
	private String deliveryTime;
	private boolean canEdit;
	
	public deliveryBean() {
		deliveryTime = "";
	}
	
	public deliveryBean(double grossCharge, double netCharge, String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	public String getDeliveryTime() {
		return deliveryTime;
	}

	public boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
}