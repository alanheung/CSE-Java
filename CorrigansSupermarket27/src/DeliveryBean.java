import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="deliveryBean")
@SessionScoped
public class DeliveryBean implements Serializable{
	private static final long serialVersionUID = 1l;
	
	private String deliveryTime;
	private boolean canEdit;
	
	public DeliveryBean() {
		deliveryTime = "";
	}
	
	public DeliveryBean(double grossCharge, double netCharge, String deliveryTime) {
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