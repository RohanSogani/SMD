
public class Cylinder {
	protected TypeOfCylinder type;
	protected double price;
	protected int quantity;
	public double get_price(){
		return price;
	}
	public void set_price(double price){
		this.price = price;
	}
	public int get_quantity(){
		return quantity;
	}
	public void set_quantity(int quantity){
		this.quantity = quantity;
	}	
}
