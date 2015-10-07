
public class Distributor extends Consumer{
	public String distributor_no;
	public String distributor_name;
	public String distributor_address;
	public String distributor_proprieter;
	static final int[] sale = new int[] {0, 0, 0, 0};
	public String getDistributor_no() {
		return distributor_no;
	}
	public void setDistributor_no(String distributor_no) {
		this.distributor_no = distributor_no;
	}
	public String getDistributor_name() {
		return distributor_name;
	}
	public void setDistributor_name(String distributor_name) {
		this.distributor_name = distributor_name;
	}
	public String getDistributor_address() {
		return distributor_address;
	}
	public void setDistributor_address(String distributor_address) {
		this.distributor_address = distributor_address;
	}
	public String getDistributor_proprieter() {
		return distributor_proprieter;
	}
	public void setDistributor_proprieter(String distributor_proprieter) {
		this.distributor_proprieter = distributor_proprieter;
	}
	
	public void issueSV(Consumer c){
		System.out.println("Issuing Subscripton Voucher to Consumer no: " + c.getConsumer_no());
		//System.out.println("Subscription no: " + c.getSubscription_number());
		//System.out.println("Date of issue: " + c.getDate_of_connection());
	}
	public void issueTV(Consumer c){
		System.out.println("Issuing Termination voucher to Consumer no: " + c.getConsumer_no());
		//System.out.println("Termination no: " + c.t.getTermination_number());
		//System.out.println("Date of Termination: " + c.t.getTermination_date());
	}
	public void getConsumers(Consumer c[]){
		System.out.println("|  |   No   |   Name   |   Address   |");
		for(int i = 0; i < c.length; i++){
			System.out.println("|" + i+1 + " | " +c[i].consumer_no +"| " + c[i].consumer_name + "| " + c[i].consumer_address + "|" );
		}
	}
	public void update_sale(TypeOfCylinder type){
		if(type == TypeOfCylinder.R5)
			sale[0]++;
		else if(type == TypeOfCylinder.R10)
			sale[1]++;
		else if(type == TypeOfCylinder.C5)
			sale[2]++;
		else if(type == TypeOfCylinder.C10)
			sale[3]++;
	}
	public void view_sale(){
		System.out.println("R5: " + sale[0]);
		System.out.println("R10: " + sale[1]);
		System.out.println("C5: " + sale[2]);
		System.out.println("C10: " + sale[3]);
	}
	public void view_amount(){
		System.out.println("R5: " + sale[0]*500);
		System.out.println("R10: " + sale[1]*550);
		System.out.println("C5: " + sale[2]*600);
		System.out.println("C10: " + sale[3]*650);
		System.out.println("Total: "  + (sale[0]*500 + sale[1]*550 + sale[2]*600 + sale[3]*650));
	}
}
