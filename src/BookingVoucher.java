import java.util.Date;

public class BookingVoucher extends Consumer {
	private int booking_number;
	public Date date_of_booking;
	public TypeOfCylinder type;
	
	public int getBooking_number() {
		return booking_number;
	}

	public void setBooking_number(int booking_number) {
		this.booking_number = booking_number;
	}

	public TypeOfCylinder getType() {
		return type;
	}

	public void setType(TypeOfCylinder type) {
		this.type = type;
	}
	
	public Date getDate_of_booking() {
		return date_of_booking;
	}

	public void setDate_of_booking(Date date_of_booking) {
		this.date_of_booking = date_of_booking;
	}
	
	int temp;
	public int getBillAmount(){
		if(type == TypeOfCylinder.R5)
			temp = 500;
		else if(type == TypeOfCylinder.R10)
			temp = 550;
		else if(type == TypeOfCylinder.C5)
			temp = 600;
		else if(type == TypeOfCylinder.C10)
			temp = 650;
		return temp;
	}
}
