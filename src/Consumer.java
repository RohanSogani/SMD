import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Consumer extends SubscriptionVoucher {
	private boolean current_connection;
	protected String consumer_no;
	protected String consumer_name;
	protected String consumer_address;
	TerminationVoucher t;
	BookingVoucher b;
	Consumer(){
		current_connection = false;
	}
	Scanner in = new Scanner(System.in);
	
	public boolean getCurrent_connection(){
		return current_connection;
	}
		
	public String getConsumer_no() {
		return consumer_no;
	}
	public void setConsumer_no(String consumer_no) {
		this.consumer_no = consumer_no;
	}
	public String getConsumer_name() {
		return consumer_name;
	}
	public void setConsumer_name(String consumer_name) {
		this.consumer_name = consumer_name;
	}
	public String getConsumer_address() {
		return consumer_address;
	}
	public void setConsumer_address(String consumer_address) {
		this.consumer_address = consumer_address;
	}
	public void bookGas(Distributor d){
		if(current_connection == true){
			int temp;
			Random rand = new Random();
			temp = rand.nextInt(30000) + 1;
			b.setBooking_number(temp);
			DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			Date dateobj = new Date();
			b.setDate_of_booking(dateobj);
			System.out.println("Booking number: " + temp);
			System.out.println("Date of booking: " + df.format(dateobj));
			System.out.println("Cylinder will be delivered within 7 days of date of booking");
			System.out.println("Bill amount:" + b.getBillAmount());
			d.update_sale(type);
		}
		else{
			System.out.println("Error: No subscription done yet! Please apply for connection");
		}	
	}
	public void getNewConnection(Distributor d){
		if(current_connection == false){
			d.issueSV(this);
			Random rand = new Random();
			subscription_number = rand.nextInt(3000) + 1;
			System.out.println("Applying for connection");
			date_of_connection = new Date();
			if(consumer_address.equals("Dhankawadi")){
				distributor_address = "Dhankawadi";
			}
			else if(consumer_address.equals("Pune Station")){
				distributor_address = "Pune Station";
			}
			else{
				System.out.println("No nearby distributor in area");
				System.exit(0);
			}
			boolean temp = false;
			while(temp != true){
				System.out.println("Select Type of Cylinder");
				System.out.println("1. 5kg Residential");
				System.out.println("2. 10kg Residential");
				System.out.println("3. 5kg Commercial");
				System.out.println("4. 10kg Commercial");
				int num = in.nextInt();
				switch(num){
					case 1:
						type = TypeOfCylinder.R5;
						b.type = TypeOfCylinder.R5;
						temp = true;
						break;
					case 2:
						type = TypeOfCylinder.R10;
						b.type = TypeOfCylinder.R10;
						temp = true;
						break;
					case 3:
						type = TypeOfCylinder.C5;
						b.type = TypeOfCylinder.C5;
						temp = true;
						break;
					case 4:
						type = TypeOfCylinder.C10;
						b.type = TypeOfCylinder.C10;
						temp = true;
						break;
					default:
						System.out.println("Please Enter Correct option");
				}
			}
			getInfo();
			current_connection = true;
		}
	}
	public void terminate_connection(Distributor d){
		current_connection = false;
		d.issueTV(this);
		Random rand = new Random();
		t.setTermination_number(rand.nextInt(3000) + 1);
		Date dateobj = new Date();
		t.setTermination_date(dateobj);
		t.getInfo();
	}
}
