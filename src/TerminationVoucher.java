import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TerminationVoucher extends Consumer{
	private int termination_number;
	public Date termination_date;
	public String remarks;
	public int getTermination_number() {
		return termination_number;
	}
	public void setTermination_number(int termination_number) {
		this.termination_number = termination_number;
	}
	public Date getTermination_date() {
		return termination_date;
	}
	public void setTermination_date(Date termination_date) {
		this.termination_date = termination_date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public void getInfo(){
		System.out.println("Connection has been terminated");
		System.out.println("Termination number: " + termination_number);
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println("Date of Termination: " + df.format(termination_date));
	}
}
