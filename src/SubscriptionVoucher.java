import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubscriptionVoucher{
	protected int subscription_number;
	public Date date_of_connection;
	public String distributor_name;
	public TypeOfCylinder type;
	public String distributor_address;
	public int getSubscription_number() {
		return subscription_number;
	}
	public TypeOfCylinder getType() {
		return type;
	}
	public void setType(TypeOfCylinder type) {
		this.type = type;
	}
	public String getDistributor_address() {
		return distributor_address;
	}
	public void setDistributor_address(String distributor_address) {
		this.distributor_address = distributor_address;
	}
	public Date getDate_of_connection() {
		return date_of_connection;
	}
	public String getDistributor_name() {
		return distributor_name;
	}
	public void setDistributor_name(String distributor_name) {
		this.distributor_name = distributor_name;
	}
	public void getInfo(){
		System.out.println("Subscription Completed");
		System.out.println("Subscription number: " + subscription_number);
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println("Date of Subscription: " + df.format(date_of_connection));
	}
}
